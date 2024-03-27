package org.example.loginquiz.Security.serivices;

import org.example.loginquiz.Model.entity.auth.Fellow;
import org.example.loginquiz.Repository.auth.FellowRepository;
import org.example.loginquiz.Security.dto.FellowDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * packageName : org.example.loginquiz.Security.serivices
 * fileName : UserDetailServiceImpl
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
@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    FellowRepository fellowRepository;

    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
        Fellow fellow = fellowRepository.findById(userId)
                .orElseThrow(() -> new UsernameNotFoundException("userId 없음" + userId));

        GrantedAuthority authority = new SimpleGrantedAuthority(fellow.getCodeName());

        Set<GrantedAuthority> authorities = new HashSet<>();
        authorities.add(authority);

        return new FellowDto(fellow.getUserId(),
                fellow.getPassword(),
                authorities
                );
    }
}
