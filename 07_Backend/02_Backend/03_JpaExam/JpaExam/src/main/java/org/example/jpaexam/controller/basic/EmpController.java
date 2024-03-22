package org.example.jpaexam.controller.basic;

import lombok.extern.slf4j.Slf4j;
import org.example.jpaexam.model.entity.basic.Dept;
import org.example.jpaexam.model.entity.basic.Emp;
import org.example.jpaexam.service.basic.EmpService;
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
 * fileName : EmpController
 * author : BALLBAT
 * date : 2024-03-19
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-19         BALLBAT          최초 생성
 */
@Slf4j
@Controller
@RequestMapping("/basic")
public class EmpController {
//  DB 서비스 클래스 가져오기
    @Autowired
    EmpService empService;

//  전체 조회
//  TODO: 페이징 복습 : page(현재 페이지 번호), size(1페이지 당 개수)
    @GetMapping("/emp")
    public String getEmpAll(Model model,
                             @RequestParam(defaultValue = "") String ename,
                             @RequestParam(defaultValue = "0") int page,
                             @RequestParam(defaultValue = "3") int size
    ){
//      TODO: 페이징 매개변수 객체 : Pageable (page, size)
        Pageable pageable = PageRequest.of(page, size);
//      TODO: DB like 검색 서비스 함수 실행
        Page<Emp> pageRes = empService.findAllByEnameContaining(ename, pageable);

        model.addAttribute("emp", pageRes.getContent()); // 1) 사원정보(배열)
        model.addAttribute("currentPage", pageRes.getNumber()); // 2) 현재 페이지 번호
        model.addAttribute("totalItems", pageRes.getTotalElements()); // 3) 전체 테이블 건수
        model.addAttribute("totalPage", pageRes.getTotalPages()); // 4) 전체 페이지 개수

//      TODO: 공식 : 블럭 시작페이지 번호 = (Math.floor(현재페이지번호/1페이지당개수)) * 1페이지당개수
//      TODO: size -> 3
//            페이지 번호 화면에 보이기 변수
        long pageNo = 5;
        long blockStartPage = (long) Math.floor((double) (pageRes.getNumber()) / pageNo) * pageNo;
        model.addAttribute("startPage", blockStartPage); // 5) 블럭 시작 페이지 번호

//      TODO:  공식 : 블럭 끝페이지 번호 = 블럭 시작페이지번호 + 1페이자당개수 - 1
        long blockEndPage = blockStartPage + pageNo - 1;
//      블럭 끝 페이지 번호 != 전체 페이지 번호 : 이 경우가 발생할 수 있음
//      블럭 끝 페이지 번호 = 전체 페이지 번호 (값 보정)
        blockEndPage = (blockEndPage >= pageRes.getTotalPages())?pageRes.getTotalPages()-1:blockEndPage;

//      TODO: blockEndPage < 0 이면 blockEndPage = 0 고정 : blockEndPage 음수이면 jsp 반복문에서 에러발생(버그 수정)
        blockEndPage = (blockEndPage < 0)? 0 : blockEndPage;

        model.addAttribute("endPage", blockEndPage); // 6) 블럭 끝 페이지 번호

//      TODO: ename -> jsp 전송
        model.addAttribute("ename", ename);

        return "basic/emp/emp_all.jsp";
    }

    //  상세 조회 (테스트용, 생략)
    @GetMapping("/emp/{eno}")
    public String getEmpId(@PathVariable int eno, Model model) {
//      DB 상세 조회 서비스 함수
        Optional<Emp> optionalEmp = empService.findById(eno);
//      JSP 객체 전송 : 사용법 : 옵셔널객체.get() : 객체 꺼내기
        model.addAttribute("emp", optionalEmp.get());
        return "basic/emp/emp_id.jsp";
    }

    @GetMapping("/emp/addition")
    public String addEmp() {
        return "basic/emp/add_emp.jsp";
    }

    @PostMapping("/emp/add")
    public RedirectView createEmp(@ModelAttribute Emp emp){
//      DB 저장 서비스 함수
        empService.save(emp);
//      전체 조회 페이지 강제 이동
        return new RedirectView("/basic/emp");
    }

//  수정 : 1) 수정 페이지 열기 함수 : 상세 조회
    @GetMapping("/emp/edition/{eno}")
    public String editEmp(Model model,
                           @PathVariable int eno){
//      서비스 상세 조회 함수 호출 : return 값 : Optional 객체
        Optional<Emp> optionalEmp = empService.findById(eno);
//      옵셔널 객체에서 결과를 꺼내서 jsp 로 전송
        model.addAttribute("emp", optionalEmp.get());
        return "/basic/emp/update_emp.jsp";
    }

//    수정 버튼 클릭시 실행될 함수
//    update -> put 방식 -> @PutMapping
    @PutMapping("/emp/edit/{eno}")
    public RedirectView updateEmp(@PathVariable int eno,
                                   @ModelAttribute Emp emp){
//      DB 서비스 함수 실행 : save()
        empService.save(emp);
//      전체 조회 페이지로 강제 이동
        return new RedirectView("/basic/emp");
    }

//    삭제 함수
//    delete -> delete 방식 -> @DeleteMapping
    @DeleteMapping("/emp/delete/{eno}")
    public RedirectView deleteEmp(@PathVariable int eno) {
//      DB 서비스 삭제 함수 실행
        empService.removeById(eno);
        return new RedirectView("/basic/emp");
    }
}
