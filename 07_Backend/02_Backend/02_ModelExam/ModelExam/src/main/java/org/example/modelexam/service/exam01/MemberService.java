package org.example.modelexam.service.exam01;

import org.example.modelexam.dao.MemberDao;
import org.example.modelexam.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
