package org.example.controllerexam.controller;

import org.example.controllerexam.model.Member;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName : org.example.controllerexam.controller
 * fileName : MultiPathRestController
 * author : GGG
 * date : 2024-03-13
 * description : @RestController
 * 요약 :
 * TODO: 1) @Controller : 클래스에 컨트롤러 기능을 부여하는 어노테이션
 *                        함수에 url 을 달 수 있고, return 값은 jsp 페이지가 됨
 *                        예) 활용 : jsp 개발 프로젝트시 사용
 *       2) @RestController : 클래스에 컨트롤러 기능을 부여하는 어노테이션
 *                        함수에 url 을 달 수 있고, return 값은 json 문서 또는 데이터가 됨
 *                        참고 : JSON 정의 : JavaScript Object Notation
 *                          (자바스크립트 객체 표현식) {속성:값, ...};
 *                        예) 활용 : Vue, React 등과 연결하는 프로젝트시 사용
 *       3) CSR vs SSR : (이론)
 *          3-1) SSR : html + css + js 완성시키는 위치가 spring(백엔드)일때
 *               (Sever Side Rendering 기술) ex. JSP
 *          3-2) CSR : html + css + js 완성시키는 위치가 Vue/React(프론트엔드)일때
 *               (Client Side Rendering 기술) ex. Vue, React 등
 *       4) 실무 용어 : Server(백엔드), Client(프론트)
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-13         GGG          최초 생성
 */
@RestController
@RequestMapping("/exam06")
public class MultiPathRestController {

// TODO: 예제 1) id, name 2개의 매개변수 전달해서 json 으로 출력하기
//   url 테스트 # 2 : http://localhost:8000/exam06/multi-path-rest/hong/honggildong
//   함수명     : getMultiVar2
//    url      : /multi-path-rest/id/{id}/name/{name}
//    Member 객체 정의 : 이것을 출력
    @GetMapping("/multi-path-rest/{id}/{name}")
    public Member getMultiVar2(
            @PathVariable String id,
            @PathVariable String name
    ){
//  멤버 객체 생성
        Member member = new Member(id, name);
        return member; // 결과가 json 데이터로 변경되어 웹브라우저로 전송됨
    }

}
