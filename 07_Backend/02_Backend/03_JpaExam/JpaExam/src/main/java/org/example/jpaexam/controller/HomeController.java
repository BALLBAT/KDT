package org.example.jpaexam.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * packageName : org.example.jpaexam.controller
 * fileName : HomeController
 * author : BALLBAT
 * date : 2024-03-22
 * description : Home : 메인 페이지 (http://localhost:8000)
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-22         BALLBAT          최초 생성
 */
@Slf4j
@Controller
public class HomeController {
//    Home : 메인 페이지 : / (루트)
//    예) 파일명 : index.jsp, index.html 등
    @GetMapping("/")
    public String getHome(){
        return "index.jsp";
    }
}
