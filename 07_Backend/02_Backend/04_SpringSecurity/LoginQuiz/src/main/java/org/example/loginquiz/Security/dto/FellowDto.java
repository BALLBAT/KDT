package org.example.loginquiz.Security.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

/**
 * packageName : org.example.loginquiz.Security.dto
 * fileName : FellowDto
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
@Setter
@Getter
@ToString
public class FellowDto extends User {
    private String userId;

    public FellowDto(String userId, String password, Collection<? extends GrantedAuthority> authorities) {
        super(userId, password, authorities);
        this.userId = userId;
    }
}
