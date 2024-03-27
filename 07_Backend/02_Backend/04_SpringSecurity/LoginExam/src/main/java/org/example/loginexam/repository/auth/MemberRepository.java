package org.example.loginexam.repository.auth;

import org.example.loginexam.model.entity.auth.Member;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * packageName : org.example.loginexam.repository.auth
 * fileName : MemberRepository
 * author : BALLBAT
 * date : 2024-03-26
 * description : 로그인 레포지토리
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-26         BALLBAT          최초 생성
 */
public interface MemberRepository extends JpaRepository<Member, String> {
}
