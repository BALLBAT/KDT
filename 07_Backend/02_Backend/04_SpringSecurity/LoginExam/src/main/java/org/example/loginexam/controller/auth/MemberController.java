package org.example.loginexam.controller.auth;

import lombok.extern.slf4j.Slf4j;
import org.example.loginexam.service.auth.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * packageName : org.example.loginexam.controller.auth
 * fileName : MemberController
 * author : BALLBAT
 * date : 2024-03-27
 * description : 로그인 컨트롤러
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-27         BALLBAT          최초 생성
 */
@Slf4j
@Controller
@RequestMapping("/auth")
public class MemberController {
//  DB 서비스 객체
    @Autowired
    MemberService memberService; // DI

    @Autowired
    PasswordEncoder passwordEncoder; // 암호화 객체 DI

//  TODO: 로그인 : 1) 로그인 페이지 열기 함수 (제작)
//                   => WebSecurityConfig.java filterChain() 함수 안에 정의
    @GetMapping("/customLogin")
    public String login() {
        return "auth/customLogin.jsp";
    }
//        2) 로그인 버튼 클릭하면 실행될 함수 (만들지 않음, 스프링 자동)
//        => jsp : form action="/auth/login"
//        => WebSecurityConfig.java filterChain() 함수 안에 정의
//        => TODO: DB 에 사용자가 있는지 확인하는 절차 (개발자가 작성)
//        => 스프링이 인증할 때 그 함수를 자동 실행
//        => TODO: DB 확인해서 정상 사용자인지 검증이 끝나면 => 검증 객체에 넣음
}
