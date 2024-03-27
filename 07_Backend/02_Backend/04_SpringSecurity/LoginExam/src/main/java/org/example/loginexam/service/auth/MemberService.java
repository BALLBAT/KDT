package org.example.loginexam.service.auth;

import org.example.loginexam.model.entity.auth.Member;
import org.example.loginexam.repository.auth.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * packageName : org.example.loginexam.service.auth
 * fileName : MemberService
 * author : BALLBAT
 * date : 2024-03-26
 * description : 로그인 서비스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-26         BALLBAT          최초 생성
 */
@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository; // DI

//  TODO: 로그인 관련 함수
//   상세 조회 함수
    public Optional<Member> findById(String email) {
        Optional<Member> optionalMember = memberRepository.findById(email);
        return optionalMember;
    }

//  기본키(email) 있는지 확인하는 함수
    public boolean existById(String email) {
//      JPA 함수 실행 : DB 에 기본키가 있으면 true, 없으면 false
        boolean result = memberRepository.existsById(email);
        return result;
    }
}
