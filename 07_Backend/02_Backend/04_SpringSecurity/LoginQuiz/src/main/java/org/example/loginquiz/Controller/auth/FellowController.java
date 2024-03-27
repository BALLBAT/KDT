package org.example.loginquiz.Controller.auth;

import lombok.extern.slf4j.Slf4j;
import org.example.loginquiz.Service.auth.FellowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * packageName : org.example.loginquiz.Controller.auth
 * fileName : FellowController
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
@Slf4j
@Controller
@RequestMapping("/auth")
public class FellowController {
    @Autowired
    FellowService fellowService; // DI

    @Autowired
    PasswordEncoder passwordEncoder; // 암호화 객체 DI

    @GetMapping("/customLogin")
    public String login() {
        return "auth/customLogin.jsp";
    }
}
