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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    @Autowired
    EmpService empService;

    @GetMapping("/emp")
    public String getEmpAll(Model model,
                             @RequestParam(defaultValue = "") String ename,
                             @RequestParam(defaultValue = "0") int page,
                             @RequestParam(defaultValue = "3") int size
    ){

        Pageable pageable = PageRequest.of(page, size);
//      TODO: DB like 검색 서비스 함수 실행
        Page<Emp> pageRes = empService.findAllByEnameContaining(ename, pageable);

        model.addAttribute("emp" ,pageRes.getContent()); // 1) 부서정보(배열)
        model.addAttribute("currentPage" ,pageRes.getNumber()); // 2) 현재 페이지 번호
        model.addAttribute("totalItems" ,pageRes.getTotalElements()); // 3) 전체 테이블 건수
        model.addAttribute("totalPage" ,pageRes.getTotalPages()); // 4) 전체 페이지 개수

//      TODO: 공식 : 블럭 시작페이지 번호 = (Math.floor(현재페이지번호/1페이지당개수)) * 1페이지당개수
        long blockStartPage = (long) Math.floor((double) (pageRes.getNumber()) / size) * size;
        model.addAttribute("startPage", blockStartPage); // 5) 블럭 시작 페이지 번호

//      TODO:  공식 : 블럭 끝페이지 번호 = 블럭 시작페이지번호 + 1페이자당개수 - 1
        long blockEndPage = blockStartPage + size - 1;
//      블럭 끝 페이지 번호 != 전체 페이지 번호 : 이 경우가 발생할 수 있음
//      블럭 끝 페이지 번호 = 전체 페이지 번호 (값 보정)
        blockEndPage = (blockEndPage >= pageRes.getTotalPages())?pageRes.getTotalPages()-1:blockEndPage;
        model.addAttribute("endPage", blockEndPage); // 6) 블럭 끝 페이지 번호

        return "basic/emp/emp_all.jsp";
    }
}
