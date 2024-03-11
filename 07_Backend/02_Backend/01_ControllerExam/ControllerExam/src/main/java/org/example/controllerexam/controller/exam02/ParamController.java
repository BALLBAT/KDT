package org.example.controllerexam.controller.exam02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * packageName : org.example.controllerexam.controller.exam02
 * fileName : ParamController
 * author : GGG
 * date : 2024-03-11
 * description : @RequestMapping, @RequestParam
 * 요약 :
 * TODO: @RequestMapping("/공통url") : 공통 url 은 함수의 url 과 결합되어 사용됨
 *         예) http://localhost:8000/공통url/함수url
 *       쿼리스트링 방식 : 웹브라우저 주소창에 값을 넣어 페이지로 결과를 출력하게 하는 방법,
 *                       다른 페이지로 값을 전달하기도 가능
 *       사용법 : http://localhost:8000/함수url?변수명=값
 *       (?변수명=값 : 쿼리스트링방식)
 *       @RequestParam : 쿼리스트링방식으로 변수에 값을 저장해서 결과를 출력하거나
 *                       다른 페이지로 전달하는 어노테이션
 *       사용법 : public String 함수명(@RequestParam(옵션=값) String 변수명){}
 *       (?변수명=값 주소창에서 전달된 값이 함수의 매개변수로 똑같이 전달됨, 단 변수명이 동일해야함)
 *       옵션=값 : defaultValue = "" :
 *           (대체 값)?변수명= : 값이 없을 경우 null 전달 -> error -> 방지를 위해 null <-> ""로 변경
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-11         GGG          최초 생성
 */
@Controller
@RequestMapping("/exam02")
// 이렇게 바깥 클래스 위로 리퀘스트맵핑을 걸어두면 공통 url 로 밑에서 생략할 수 있다.
public class ParamController {

//  TODO: 예제 1) 쿼리스트링 방식을 이용해서 jsp 값을 전달하세요
//          url : /exam02/hello-name
//          함수 : HelloName
//          jsp : exam02/hello.jsp
//    url 테스트 방법 : http://localhost:8000/exam02/hello-name?name=홍길동
    @GetMapping("/hello-name")
    public String HelloName(Model model,
                            @RequestParam(defaultValue = "") String name
                            ) {
        model.addAttribute("greeting", "안녕하세요" + name);
        return "exam02/hello.jsp";
    }

//  연습 1) url : /exam02/hello-dname
//               jsp : exam02/example01.jsp
//               문제 : dname(Sales)의 값을 url 쿼리스트링으로 전달해서
//                example01.jsp 에 출력해 보세요
//               결과 : 부서명 : Sales
//       url 테스트 : http://localhost:8000/exam02/hello-dname?dname=Sales
    @GetMapping("/hello-dname")
    public String HelloDname(Model model,
                             @RequestParam(defaultValue = "") String dname) {
        model.addAttribute("greeting", "부서명 : "+ dname);
        return "exam02/example01.jsp";
    }
}
