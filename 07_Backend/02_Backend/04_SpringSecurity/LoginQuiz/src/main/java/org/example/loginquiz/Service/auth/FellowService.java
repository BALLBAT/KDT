package org.example.loginquiz.Service.auth;

import org.example.loginquiz.Model.entity.auth.Fellow;
import org.example.loginquiz.Repository.auth.FellowRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * packageName : org.example.loginquiz.Service.auth
 * fileName : FellowService
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
@Service
public class FellowService {
    private FellowRepository fellowRepository; // DI

    public FellowRepository findById(String userId) {
        Optional<Fellow> optionalFellow = fellowRepository.findById(userId);
        return fellowRepository;
    }

    //  기본키(userId) 있는지 확인하는 함수
    public boolean existById(String userId) {
//      JPA 함수 실행 : DB 에 기본키가 있으면 true, 없으면 false
        boolean result = fellowRepository.existsById(userId);
        return result;
    }
}
