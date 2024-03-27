package org.example.loginexam.service.basic;

import org.example.loginexam.model.entity.basic.Emp;
import org.example.loginexam.repository.basic.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * packageName : org.example.jpaexam.service.basic
 * fileName : EmpService
 * author : BALLBAT
 * date : 2024-03-19
 * description : 사원 서비스 : DB JPA CRUD 함수 이용 업무 로직 만드는 곳
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-19         BALLBAT          최초 생성
 */
@Service
public class EmpService {
    //  DB CRUD 클래스 받기 : JPA 제공 함수 사용 가능 : DI(의존성 주입)
//  DI : Dependency Injection
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

//  전체 조회 + like 검색 함수
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

//  TODO: 연습 : EmpService 클래스에서 상세 조회 findbyId()
//              EmpController 클래스에서 getEmpId()
//              emp_id.jsp(테스트 목적)
    public Optional<Emp> findById(int eno) {
//      JPA 상세 조회 함수 실행
        Optional<Emp> optionalEmp = empRepository.findById(eno);
        return optionalEmp;
    }

//  TODO: 연습 : EmpService 클래스에서 저장/수정 save()
//               EmpController 클래스에서 addEmp()
//               add_emp.jsp(테스트목적)
//               url : /emp/addition

    public Emp save(Emp emp) {
//      JPA 의 저장 함수 : return 값 : 저장된 객체
        Emp emp2 = empRepository.save(emp);

        return emp2;
    }

//   TODO: 연습 : EmpService.java => 삭제함수 removeById()
//               EmpController.java => deleteEmp()
//               jsp : 수정페이지에 삭제버튼 추가
//  삭제 함수
public boolean removeById(int eno) {
//        JPA 삭제 함수 : deleteById(기본키)
//        1) 먼저 기본키가 테이블에 있으면 삭제, true 리턴
//           없으면 false 리턴

//        사용법 : JPA 레포지토리.exsistById*기본키)
//           => 기본키가 테이블에 있는지 확인, 있으면 true / 없으면 false
    if (empRepository.existsById(eno) == true) {
        empRepository.deleteById(eno);
        return true;
    } else {
        return false;
    }
}
}
