package org.example.modelexam.controller.exam01;

import lombok.extern.slf4j.Slf4j;
import org.example.modelexam.model.Dept;
import org.example.modelexam.model.Faq;
import org.example.modelexam.service.exam01.FaqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

/**
 * packageName : org.example.modelexam.controller.exam01
 * fileName : FaqController
 * author : BALLBAT
 * date : 2024-03-18
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-18         BALLBAT          최초 생성
 */
@Slf4j
@Controller
@RequestMapping("/exam01")
public class FaqController {
    @Autowired
     FaqService faqService;

    @GetMapping("/faq")
    public String getFaqAll(Model model) {
        List<Faq> list = faqService.findAll();
        model.addAttribute("list", list);
        return "exam01/faq/faq_all.jsp";
    }

//  상세 조회 함수
//  정리 : @PathVariable : html (jsp 등 : 보내는 쪽) -> springboot 애 전달 받기
//        Model(택배 상자) : springboot(보내는 쪽) -> html(jsp 등) 에 전달 받기
    @GetMapping("/faq/{fno}")
    public String getDeptId(@PathVariable Integer fno,
                            Model model){
//      TODO: service 의 상세조회 함수(findById) 호출
        Faq faq = faqService.findById(fno);
//      TODO: jsp dept 객체 전송
        model.addAttribute("faq", faq);
        return "exam01/faq/faq_id.jsp";
    }

    @GetMapping("/faq/addition")
    public String addFaq() {
        return "exam01/faq/add_faq.jsp";
    }

    @PostMapping("/faq/add")
    public RedirectView createFaq(@ModelAttribute Faq faq){
//      TODO: DB 저장 함수 실행
        faqService.save(faq);

        return new RedirectView("/exam01/faq");
    }

    @GetMapping("/faq/edition/{fno}")
    public String editFaq(@PathVariable Integer fno,
                           Model model) {
//      TODO: 1) 먼저 상세조회를 1건 함
        Faq faq = faqService.findById(fno);
//      TODO: 2) 부서 객체를 jsp 로 전송
        model.addAttribute("faq", faq);

        return "exam01/faq/update_faq.jsp";
    }

    @PutMapping("/faq/edit/{fno}")
    public RedirectView updateFaq(@PathVariable Integer fno,
                                   @ModelAttribute Faq faq){
        faqService.save(faq);
//      TODO: 전체 조회 페이지로 강제 이동 : /exam01/dept
        return new RedirectView("/exam01/faq");
    }

    @DeleteMapping("/faq/delete/{fno}")
    public RedirectView deleteFaq(@PathVariable Integer fno) {
//        TODO: DB 삭제 함수 실행(서비스)
        faqService.removeById(fno);
//        TODO: 삭제 후 전체 조회 페이지로 강제 이동
        return new RedirectView("/exam01/faq");
    }
}
