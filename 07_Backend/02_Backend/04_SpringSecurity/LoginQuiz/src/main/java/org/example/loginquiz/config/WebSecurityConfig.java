package org.example.loginquiz.config;

import jakarta.servlet.DispatcherType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

/**
 * packageName : org.example.loginquiz.config
 * fileName : WebSecurityConfig
 * author : BALLBAT
 * date : 2024-03-27
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-27         BALLBAT          최초 생성
 */
@Configuration
public class WebSecurityConfig {
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web.ignoring().requestMatchers(
                "/resources/img/**",
                "/resources/css/**",
                "/resources/js/**",
                "/WEB-INF/views/**" // 직접 jsp include 하는 것은 인증 제외
        );
    }

    //  TODO: 스프링 시큐리티 규칙 정의 함수(*** 중요)
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//      TODO: 스프링 시큐리티 : 기본 설정이 없으면 모든 요청에 대해 보안모드로 적용됨
//         => 로그인 화면(기본 화면 : 스프링 시큐리티 라이브러리에서 제공함)
//         => WebSecurityConfig.java filterChain() 에서 인증 설정하면 화면 볼 수 있음

//      TODO: 인증 설정 부분 : 1) authorize : 권한 설정 (인가)
//                              (권한에 다라 화면을 볼 수 있는 설정)
//                           2) authentication : 인증 (로그인 : id/password)

//      TODO: spring 버전 상관 없이 설정
        http.authorizeHttpRequests(req -> req
                .dispatcherTypeMatchers(DispatcherType.FORWARD).permitAll()
                .requestMatchers("/auth/**").permitAll()       // 이 url 은 모든 사용자 접근 허용
                .requestMatchers("/admin/**").hasRole("ADMIN") // admin 메뉴는 ROLE_ADMIN 만 가능
                .requestMatchers("/basic/**").permitAll()           // 이 url 은 모든 사용자 접근 허용
                .requestMatchers("/").permitAll()           // 이 url 은 모든 사용자 접근 허용
                .anyRequest()
                .authenticated());

//      TODO: 2) 인증(로그인/로그아웃) 관리 : 쿠키/세션 방식(스프링 시큐리티에서 자동 관리)
//           (1) 로그인 설정
        http.formLogin(req -> req
                .loginPage("/auth/customLogin") // 사용자가 만든 화면 로그인 사용
                .loginProcessingUrl("/auth/login") // Url 로 요청이 될 시 SpringSecurity 가 직접 알아서
                // 로그인 과정을 진행 : 컨트롤러함수 필요없음, 대신 user(userdetails) 정의 필요
                .defaultSuccessUrl("/") // 로그인 성공하면 이동할 페이지 url
        );

//      TODO: (2) 로그아웃 설정
        http.logout(
                req -> req
                        .logoutUrl("/auth/customLogout") // 스프링에서 logout url 제공함 (로그아웃 페이지는 따로 필요없음)
                        .invalidateHttpSession(true) // session 삭제 후
                        .logoutSuccessUrl("/") // logout 에 성공하면 /로 redirect
        );
        return http.build();
    }
}