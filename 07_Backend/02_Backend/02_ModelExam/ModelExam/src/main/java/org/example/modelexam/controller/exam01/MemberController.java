package org.example.modelexam.controller.exam01;

import org.example.modelexam.model.Dept;
import org.example.modelexam.model.Member;
import org.example.modelexam.service.exam01.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

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

//  url test : http://lcoalhost:8000/exam01/member/7369
    @GetMapping("/member/{eno}")
    public String getMemberId(Model model,
                              @PathVariable long eno) {
        Member member = memberService.findById(eno);
        model.addAttribute("member", member);
        return "exam01/member/member_id.jsp";
    }

//  TODO: 새로운 멤버 추가 페이지 열기 함수 #1
    @GetMapping("/member/addition")
    public String addMember() {
        return "exam01/member/add_member.jsp";
    }

//  TODO: 저장 버튼 클릭시 실행될 함수 #2
//    jsp : /exam01/member (강제 페이지 이동 : 전체조회)
//    url : /exam/member/add
//    html : form 방식 : (insert -> post 방식)
//    어노테이션 : insert -> @PostMapping("/url")
//    Member 객체 : eno(정수), ename(문자열), job(문자열), manager(정수)
@PostMapping("/member/add")
public RedirectView createMember(@ModelAttribute Member member){
//      TODO: DB 저장 함수 실행
    memberService.save(member);

//   TODO: 전체 조회 페이지로 강제 이동
//      RedirectView : 이 클래스가 강제로 페이지 이동을 시켜주는 것
//      사용법 : new RedirectView("/공통url/함수url")
    return new RedirectView("/exam01/member");
}

//  TODO: 수정 페이지 열기 함수
//    => 수정 페이지가 열릴 때
//    url : member/edition/{eno}
//    jsp : exam01/member/update_member.jsp
    @GetMapping("/member/edition/{eno}")
    public String editDept(@PathVariable long eno,
                           Model model) {
//      TODO: 1) 먼저 상세조회를 1건 함
        Member member = memberService.findById(eno);
//      TODO: 2) 부서 객체를 jsp 로 전송
        model.addAttribute("member", member);

        return "exam01/member/update_member.jsp";
    }
}
