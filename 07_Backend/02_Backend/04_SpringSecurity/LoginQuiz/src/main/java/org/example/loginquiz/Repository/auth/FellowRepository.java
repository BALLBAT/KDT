package org.example.loginquiz.Repository.auth;

import org.example.loginquiz.Model.entity.auth.Fellow;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * packageName : org.example.loginquiz.Repository.auth
 * fileName : FellowRepository
 * author : BALLBAT
 * date : 2024-03-27
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-27         BALLBAT          최초 생성
 */
public interface FellowRepository extends JpaRepository<Fellow, String> {
}
