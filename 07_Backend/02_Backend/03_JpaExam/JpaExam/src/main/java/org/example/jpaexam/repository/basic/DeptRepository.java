package org.example.jpaexam.repository.basic;

import org.example.jpaexam.model.entity.basic.Dept;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * packageName : org.example.jpaexam.repository.basic
 * fileName : DeptRepository
 * author : BALLBAT
 * date : 2024-03-19
 * description : 레포지토리 클래스 : DB CRUD 함수가 있는 인터페이스
 * 요약 :
 * TODO: CRUD 용어 : C(Create==Insert), R(Read==Select), U(Update==Update), D(Delete==Delete)
 *                  DML(데이터 조작어) 문임
 *       사용법 : interface 이름 extends JpaRepository<엔티티명, 기본키 속성 자료형>
 *               => 엔티티명 : DB 와 연결될 엔티티명
 *               => 기본키 속성 자료형 : 엔티티의 기본키 속성 자료형 명시
 *               => JPA 기본 함수 사용 가능
 *                  - findAll() : 전체 조회, 자동 sql 문 생성
 *                  - findById(기본키) : 상세 조회(1건), 자동 sql 문 생성
 *                  - save(객체) : 저장/수정을 알아서 실행함
 *                        저장 : 기본키가 없으면 insert
 *                        수정 : 기본키가 있으면 update
 *                  - deleteById(기본키) : 삭제 함수, 자동 sql 문 생성
 *
 *TODO:  페이징 처리 + like 검색어
 *       like 검색 sql 문 작성 :
 *       사용법 : @Query(value="sql 문", countQuery="sql 문2", nativeQuery=true)
 *        - @Param("매개변수명") : sql 문 속으로 함수의 매개변수 값을 전달하기 위한 어노테이션
 *        - select ~ where 컬럼명 like :매개변수명 : 함수매개변수 == :매개변수(일치)
 *        - JPA @Query 옵션 : nativeQuery=true[false]
 *              1) nativeQuery=true : 오라클 sql 문 사용 가능
 *              2) nativeQuery=false : 객체 sql 문(JPQL) 사용해야함 (참고)
 *                                     , 생략 가능
 *    Page<엔티티> 객체 : 페이징된 결과값을 저장할 객체(함수의 리턴값으로 사용)
 *          - 예) 속성 : 현재 페이지 번호, 전체 페이지 건수 등
 *    Pageable 객체 : 페이징하기 위한 객체(함수의 매개변수로 사용)
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-19         BALLBAT          최초 생성
 */
@Repository
public interface DeptRepository extends JpaRepository<Dept, Integer> {
    @Query(value = "SELECT D.* FROM TB_DEPT D\n" +
            "    WHERE D.DNAME LIKE '%'|| :dname ||'%'",
            countQuery = "SELECT COUNT(*) FROM TB_DEPT D\n" +
                    "WHERE D.DNAME LIKE '%'|| :dname ||'%'",
            nativeQuery = true)
    Page<Dept> findAllByDnameContaining(
            @Param("dname") String dname,
            Pageable pageable
    );
}

