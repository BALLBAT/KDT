package org.example.modelexam.service.exam01;

import org.example.modelexam.dao.MemberDao;
import org.example.modelexam.model.Dept;
import org.example.modelexam.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : org.example.modelexam.service.exam01
 * fileName : MemberService
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
@Service
public class MemberService {
//    연습 1:
//    MemberService 클래스를 만들고 findAll() 함수를 정의한다.
//     ( MemberDao : DB 조회/수정/삭제/추가 함수가 있는 클래스 )
//    MemberController 클래스를 만들어서 getMemberAll() 함수를 정의하고,
//    샘플데이터 뷰로(jsp : exam01/member/member_all.jsp) 전송해 보세요.
//     url : /member
//     jsp : exam01/member/member_all.jsp

    @Autowired
    MemberDao memberDao; // DB 조회/수정/삭제/추가 함수가 있는 클래스

    public List<Member> findAll(){
        List<Member> list = memberDao.selectAll();
        return list;
    }

//  TODO: 연습 2)
//    MemberService 클래스를 만들고 findById() 함수를 정의한다.
//    MemberController 클래스를 만들어서 getMemberId() 함수를 정의하고,
//    샘플데이터 뷰로(jsp : member_id.jsp) 전송해 보세요.
//    url : /member/{eno}
//    jsp : exam01/member/member_id.jsp
//    url test : http://localhost:8000/exam01/member/7369
    @GetMapping("/member")
    public Member findById(long eno) {
        Member member = memberDao.selectById(eno);
        return member;
    }

//  TODO: 연습 3)
//    MemberService 클래스를 만들고 save() 함수를 정의한다.
//    MemberController 클래스를 만들어서 addMember(),
//    createMember() 함수를 정의
//    addMember()
//    - url : /member/addition
//    - jsp : exam01/member/add_member.jsp
    /**
     * 회원 저장 함수
     * @param member
     * @return
     */
    public List<Member> save(Member member) {

        List<Member> list = null;
        if (member.getEno() == null) {
//            TODO: 부서 추가
//        1) ui(frontend) -> insert (사원번호가 없으면)
//        2) member 사원 테이블의 전체 건수 구한 후 :
//            List/ArrayList 배열 크기 함수 : .size()
            int count = memberDao.selectAll().size();
//        3) 새로운 번호 : 크기 + 8000
            int newEno = count + 8000;
//        4) member 의 setter 함수(속성 수정/저장 함수) 새로운 사전 저장
            member.setEno(newEno);
//    TODO: DB 저장함수 (insert 함수)
            list = memberDao.insert(member);
        } else {
//            TODO: 부서 수정(update)
            list = memberDao.update(member);
        }
        return list;
    }

//  TODO: 연습 5)
//    MemberService 클래스를 만들고 save() 함수를 정의하고 update 하세요
//    MemberController 클래스를 만들어서 editMember() 함수를 정의
//    editMember()
//    - url : /member/edition/{eno}
//    - jsp : exam01/member/update_member.jsp
//    - url test : http://localhost:8000/exam01/member/edition/7369

//  TODO: 연습 5)
//    MemberService 클래스를 만들고 save() 함수를 정의하고 update 하세요
//    MemberController 클래스를 만들어서 editMember() 함수를 정의
//    editMember(), updateMember() 정의하세요
//    - url : /member/edition/{eno}
//    - jsp : exam01/member/update_member.jsp
//    - url 테스트 : http://localhost:8000/exam01/member/edition/7369
//    updateMember()
//    - url : /member/edit/{eno}
//    - redirect url : /exam01/member
    /**
     * 사원번호(eno) 로 삭제하는 함수
     * @param eno(사원번호)
     * @return
     */
    public boolean removeById(int eno) {
//      TODO: DB 삭제 함수 실행
        int count = memberDao.deleteById(eno);

        return (count > 0)? true : false;
    }
}
