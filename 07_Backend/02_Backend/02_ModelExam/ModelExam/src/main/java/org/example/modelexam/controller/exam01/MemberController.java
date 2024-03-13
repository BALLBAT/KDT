package org.example.modelexam.controller.exam01;

import org.example.modelexam.model.Dept;
import org.example.modelexam.model.Member;
import org.example.modelexam.service.exam01.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * packageName : org.example.modelexam.controller.exam01
 * fileName : MemberController
 * author : GGG
 * date : 2024-03-13
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-13         GGG          최초 생성
 */
@Controller
@RequestMapping("/exam01")
public class MemberController {

    @Autowired
    MemberService memberService; // 객체 정의

    @GetMapping("/member")
    public String getMemberAll(Model model) {

//      TODO: Service 객체의 전체 조회 함수를 호출
        List<Member> list = memberService.findAll();
//      TODO: model 에 담아 jsp 로 전달
        model.addAttribute("list", list);

        return "exam01/member/member_all.jsp";
    }

}
