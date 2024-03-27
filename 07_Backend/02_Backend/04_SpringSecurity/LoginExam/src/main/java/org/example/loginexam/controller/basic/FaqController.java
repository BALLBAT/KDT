package org.example.loginexam.controller.basic;

import lombok.extern.slf4j.Slf4j;
import org.example.loginexam.model.entity.basic.Faq;
import org.example.loginexam.service.basic.FaqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Optional;

/**
 * packageName : org.example.jpaexam.controller.basic
 * fileName : FaqController
 * author : BALLBAT
 * date : 2024-03-21
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-21         BALLBAT          최초 생성
 */
@Slf4j
@Controller
@RequestMapping("/basic")
public class FaqController {
    //  DB 서비스 클래스 가져오기
    @Autowired
    FaqService faqService;

    //  전체 조회
//  TODO: 페이징 복습 : page(현재 페이지 번호), size(1페이지 당 개수)
    @GetMapping("/faq")
    public String getFaqAll(Model model,
                            @RequestParam(defaultValue = "") String title,
                            @RequestParam(defaultValue = "0") int page,
                            @RequestParam(defaultValue = "3") int size
    ){
//      TODO: 페이징 매개변수 객체 : Pageable (page, size)
        Pageable pageable = PageRequest.of(page, size);
//      TODO: DB like 검색 서비스 함수 실행
        Page<Faq> pageRes = faqService.findAllByTitleContaining(title, pageable);

        model.addAttribute("faq", pageRes.getContent()); // 1) faq정보(배열)
        model.addAttribute("currentPage", pageRes.getNumber()); // 2) 현재 페이지 번호
        model.addAttribute("totalItems", pageRes.getTotalElements()); // 3) 전체 테이블 건수
        model.addAttribute("totalPage", pageRes.getTotalPages()); // 4) 전체 페이지 개수

//      TODO: 공식 : 블럭 시작페이지 번호 = (Math.floor(현재페이지번호/1페이지당개수)) * 1페이지당개수
        long blockStartPage = (long) Math.floor((double) (pageRes.getNumber()) / size) * size;
        model.addAttribute("startPage", blockStartPage); // 5) 블럭 시작 페이지 번호

//      TODO:  공식 : 블럭 끝페이지 번호 = 블럭 시작페이지번호 + 1페이자당개수 - 1
        long blockEndPage = blockStartPage + size - 1;
//      블럭 끝 페이지 번호 != 전체 페이지 번호 : 이 경우가 발생할 수 있음
//      블럭 끝 페이지 번호 = 전체 페이지 번호 (값 보정)
        blockEndPage = (blockEndPage >= pageRes.getTotalPages())?pageRes.getTotalPages()-1:blockEndPage;

//      TODO: blockEndPage < 0 이면 blockEndPage = 0 고정 : blockEndPage 음수이면 jsp 반복문에서 에러발생(버그 수정)
        blockEndPage = (blockEndPage < 0)? 0 : blockEndPage;

        model.addAttribute("endPage", blockEndPage); // 6) 블럭 끝 페이지 번호

        return "basic/faq/faq_all.jsp";
    }

    //  상세 조회 (테스트용, 생략)
    @GetMapping("/faq/{fno}")
    public String getFaqId(@PathVariable int fno, Model model) {
//      DB 상세 조회 서비스 함수
        Optional<Faq> optionalFaq = faqService.findById(fno);
//      JSP 객체 전송 : 사용법 : 옵셔널객체.get() : 객체 꺼내기
        model.addAttribute("faq", optionalFaq.get());
        return "basic/faq/faq_id.jsp";
    }

    @GetMapping("/faq/addition")
    public String addFaq() {
        return "basic/faq/add_faq.jsp";
    }

    @PostMapping("/faq/add")
    public RedirectView createFaq(@ModelAttribute Faq faq){
//      DB 저장 서비스 함수
        faqService.save(faq);
//      전체 조회 페이지 강제 이동
        return new RedirectView("/basic/faq");
    }

    //  수정 : 1) 수정 페이지 열기 함수 : 상세 조회
    @GetMapping("/faq/edition/{fno}")
    public String editEmp(Model model,
                          @PathVariable int fno){
//      서비스 상세 조회 함수 호출 : return 값 : Optional 객체
        Optional<Faq> optionalFaq = faqService.findById(fno);
//      옵셔널 객체에서 결과를 꺼내서 jsp 로 전송
        model.addAttribute("faq", optionalFaq.get());
        return "/basic/faq/update_faq.jsp";
    }

    //    수정 버튼 클릭시 실행될 함수
//    update -> put 방식 -> @PutMapping
    @PutMapping("/faq/edit/{fno}")
    public RedirectView updateFaq(@PathVariable int fno,
                                  @ModelAttribute Faq faq){
//      DB 서비스 함수 실행 : save()
        faqService.save(faq);
//      전체 조회 페이지로 강제 이동
        return new RedirectView("/basic/faq");
    }

    //    삭제 함수
//    delete -> delete 방식 -> @DeleteMapping
    @DeleteMapping("/faq/delete/{fno}")
    public RedirectView deleteFaq(@PathVariable int fno) {
//      DB 서비스 삭제 함수 실행
        faqService.removeById(fno);
        return new RedirectView("/basic/faq");
    }
}
