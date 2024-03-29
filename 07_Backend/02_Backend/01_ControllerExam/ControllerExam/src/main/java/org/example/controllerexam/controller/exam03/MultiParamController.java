package org.example.controllerexam.controller.exam03;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : org.example.controllerexam.controller.exam03
 * fileName : MultiParamController
 * author : GGG
 * date : 2024-03-12
 * description : @Controller, @RequestMapping, @RequestParam 2개 이상 사용
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-12         GGG          최초 생성
 */
@Controller
@RequestMapping("/exam03")
public class MultiParamController {
// TODO: 예제 1) URL 매개변수 2개를 각각 jsp 에 전달하세요
//       URL 테스트 : http://localhost:8000/exam03/hello-name-id?name=honggildong&id=hong
//       함수명 : setHelloNameId
//       url : /hello-name-id
//       jsp : exam03/hello_name_id.jsp
    @GetMapping("/hello-name-id")
    public String setHelloNameId(Model model,
                                 @RequestParam(defaultValue = "") String name,
                                 @RequestParam(defaultValue = "") String id
                                 ) {
        model.addAttribute("name", name);
        model.addAttribute("id", id);
        return "exam03/hello_name_id.jsp";
    }

//  연습 1) URL 매개변수로 dno=10, dName=Accounting, loc=NewYork 받았다. 아래 결과를 화면에 출력하세요.
//         url : /example01
//         함수 : setExample01
//         jsp : exam03/example01.jsp
//         결과 :
//              부서번호 : 10
//              부서명 : Accounting
//              위치 : NewYork
//    url 테스트 : http://localhost:8000/exam03/example01?dno=10&dname=Accounting&loc=NewYork
    @GetMapping("/example01")
    public String setExample01 (Model model,
                                @RequestParam(defaultValue = "0") int dno,
                                @RequestParam(defaultValue = "") String dname,
                                @RequestParam(defaultValue = "") String loc
                                ) {
        model.addAttribute("dno", "부서번호 : "+dno);
        model.addAttribute("dname", "부서명 : "+dname);
        model.addAttribute("loc", "위치 : "+loc);
        return "exam03/example01.jsp";
    }

// TODO: 예제 2) url 매개변수를 ArrayList 로 jsp 에 전달
//    URL 테스트 : http://localhost:8000/exam03/hello-array?name=kang&id=forbob
//    함수 : setHelloArray
//    url : /hello-array
//    jsp : exam03/hello_array.jsp
    @GetMapping("/hello-array")
    public String setHelloArray(Model model,
                                @RequestParam(defaultValue = "") String name,
                                @RequestParam(defaultValue = "") String id
                                ) {
//      향상된 배열 : ArrayList
//      복습 : List<자료형> 변수명 = new ArrayList<>();
//      함수 : 변수명.add(값), 변수명.get(인덱스번호)
        List<String> list = new ArrayList<>();
        list.add(name);
        list.add(id);
        model.addAttribute("list", list);
        return "exam03/hello_array.jsp";
    }

// TODO: 연습 2) 연습 1에서 작성한 dno, dname, loc 를 ArrayList 담아서 jsp 전달하세요
//    화면에 출력시 부트스트랩 테이블을 이용해서 출력하세요
//    url : /example02
//    jsp : exam03/example02.jsp
//    url 테스트 : http://localhost:8000/exam03/example02?dno=10&dname=Accounting&loc=NewYork
//    힌트) List<String> list = new ArrayList<>();
//        list.add(String.valueOf(dno));  // 숫자 -> 문자열 변환
//    결과 : 테이블 형태로
//      부서번호 : 10
//      부서명 : Accounting
//      위치 : NewYork
@GetMapping("/example02")
    public String setExample02(Model model,
                               @RequestParam(defaultValue = "0") int dno,
                               @RequestParam(defaultValue = "") String dname,
                               @RequestParam(defaultValue = "") String loc
                               ) {
        List<String> list = new ArrayList<>();
        list.add(String.valueOf(dno));
        list.add(dname);
        list.add(loc);
        model.addAttribute("list", list);
        return "exam03/example02.jsp";
    }

// TODO: 연습 3) 아래 결과를 ArrayList 담아서 jsp 전달하세요
//    화면에 출력시 부트스트랩 테이블을 이용해서 출력하세요
//    url : /example03
//    함수 : setExample02
//    jsp : exam03/example03.jsp
//    url 테스트 : http://localhost:8000/exam03/example03?eno=7788&ename=Scott&salary=3000&job=Manager
//    결과 : 테이블 형태로
//      사원번호 : 7788
//      사원명 : Scott
//      월급 : 3000
//      직위 : Manager
    @GetMapping("/example03")
    public String setExample02(Model model,
                               @RequestParam(defaultValue = "0") int eno,
                               @RequestParam(defaultValue = "") String ename,
                               @RequestParam(defaultValue = "0") int salary,
                               @RequestParam(defaultValue = "") String job
                               ) {
        List<String> list = new ArrayList<>();
        list.add(String.valueOf(eno));
        list.add(ename);
        list.add(String.valueOf(salary));
        list.add(job);
        model.addAttribute("list", list);
        return "/exam03/example03.jsp";
    }

// TODO: 예제 3) url 매개변수 3개 전달해서 jsp 에서 조건에따라 출력하세요
//   URL 테스트 : http://localhost:8000/exam03/condition?name=삼식이&color=brown&kind=dog
//   함수 : setCondition
//   url : /condition
//   jsp : exam03/condition.jsp
    @GetMapping("/condition")
    public String setCondition(Model model,
                               @RequestParam(defaultValue = "") String name,
                               @RequestParam(defaultValue = "") String color,
                               @RequestParam(defaultValue = "") String kind
                               ) {
        model.addAttribute("name", name);
        model.addAttribute("color", color);
        model.addAttribute("kind", kind);
        return "/exam03/condition.jsp";
    }

// TODO: 연습 4) : 아래의 결과를 출력하세요, 조건문 이용해서 아래 출력
//    url : /example04
//    함수 : setExample04
//    jsp : exam03/example04.jsp
//    URL 테스트 : http://localhost:8000/exam03/example04?title=아반떼&color=grey&kind=세단
//    결과 : 아반떼가 맞습니다.
//          회색입니다.
    @GetMapping("/example04")
    public String setExample04(Model model,
                               @RequestParam(defaultValue = "") String title,
                               @RequestParam(defaultValue = "") String color,
                               @RequestParam(defaultValue = "") String kind
                               ) {
        model.addAttribute("title", title);
        model.addAttribute("color", color);
        model.addAttribute("kind", kind);
        return "/exam03/example04.jsp";
    }
}
