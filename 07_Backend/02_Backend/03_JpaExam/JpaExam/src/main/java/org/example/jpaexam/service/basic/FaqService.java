package org.example.jpaexam.service.basic;

import org.example.jpaexam.model.entity.basic.Faq;
import org.example.jpaexam.repository.basic.FaqRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * packageName : org.example.jpaexam.service.basic
 * fileName : FaqService
 * author : BALLBAT
 * date : 2024-03-21
 * description :
 * 요약 :
 * TODO: IOC : 제어의 역전(Inversion Of Control)
 *             스프링이 객체를 생성해줌
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-21         BALLBAT          최초 생성
 */
@Service
public class FaqService {
    //  DB CRUD 클래스 받기 : JPA 제공 함수 사용 가능
    @Autowired
    FaqRepository faqRepository; // DI

    /**
     * 전체 조회 : 페이징 없음
     * @return faq 배열
     */
    public List<Faq> findAll() {
//      JPA 전체 조회 함수 실행 : select 문 자동 작성
        List<Faq> list = faqRepository.findAll();
        return list;
    }

    /**
     * like 검색 함수 : 페이징 처리
     * @param title
     * @param pageable
     * @return
     */
    public Page<Faq> findAllByTitleContaining(String title,
                                               Pageable pageable){
//      DB like 검색 함수 실행 : 페이징 처리
        Page<Faq> page
                = faqRepository.findAllByTitleContaining(title, pageable);
        return page;
    }

    /**
     * 상세 조회 : return : 객체 1개 (null 가능성 있음)
     * 복습 : null 방지 래퍼 클래스 : Optional<객체>
     * @param fno(faq번호)
     * @return 옵셔널 부서 객체
     */
    public Optional<Faq> findById(int fno) {
//      JPA 상세 조회 함수 실행
        Optional<Faq> optionalFaq = faqRepository.findById(fno);
        return optionalFaq;
    }

    //    저장/수정 : 1) 기본키가 없으면 저장(insert)
//               2) 기본키가 있으면 수정(update)
//             => JPA 내부적으로 if문 있음 : so, 알아서 실행됨
    public Faq save(Faq faq) {
//      JPA 의 저장 함수 : return 값 : 저장된 객체
        Faq faq2 = faqRepository.save(faq);

        return faq2;
    }

    //  삭제 함수
    public boolean removeById(int fno) {
//        JPA 삭제 함수 : deleteById(기본키)
//        1) 먼저 기본키가 테이블에 있으면 삭제, true 리턴
//           없으면 false 리턴

//        사용법 : JPA 레포지토리.exsistById*기본키)
//           => 기본키가 테이블에 있는지 확인, 있으면 true / 없으면 false
        if (faqRepository.existsById(fno) == true) {
            faqRepository.deleteById(fno);
            return true;
        } else {
            return false;
        }
    }
}
