package org.example.jpaexam.service.basic;

import org.example.jpaexam.model.entity.basic.Dept;
import org.example.jpaexam.model.entity.basic.Emp;
import org.example.jpaexam.repository.basic.DeptRepository;
import org.example.jpaexam.repository.basic.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * packageName : org.example.jpaexam.service.basic
 * fileName : EmpService
 * author : BALLBAT
 * date : 2024-03-19
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-19         BALLBAT          최초 생성
 */
@Service
public class EmpService {
    //  DB CRUD 클래스 받기 : JPA 제공 함수 사용 가능
    @Autowired
    EmpRepository empRepository;

    /**
     * 전체 조회 : 페이징 없음
     * @return 사원 배열
     */
    public List<Emp> findAll() {
//      JPA 전체 조회 함수 실행 : select 문 자동 작성
        List<Emp> list = empRepository.findAll();
        return list;
    }

    /**
     * like 검색 함수 : 페이징 처리
     * @param ename
     * @param pageable
     * @return
     */
    public Page<Emp> findAllByEnameContaining(String ename,
                                               Pageable pageable){
//      DB like 검색 함수 실행 : 페이징 처리
        Page<Emp> page
                = empRepository.findAllByEnameContaining(ename, pageable);
        return page;
    }
}
