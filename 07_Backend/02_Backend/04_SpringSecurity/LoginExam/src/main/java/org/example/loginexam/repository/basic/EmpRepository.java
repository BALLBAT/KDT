package org.example.loginexam.repository.basic;

import org.example.loginexam.model.entity.basic.Emp;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * packageName : org.example.jpaexam.repository.basic
 * fileName : EmpRepository
 * author : BALLBAT
 * date : 2024-03-19
 * description : 사원 레포지토리 : 사원 CRUD 함수가 있는 인터페이스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-19         BALLBAT          최초 생성
 */
@Repository
public interface EmpRepository extends JpaRepository<Emp, Integer> {
//  like 검색 함수 : JPA sql 직접 작성 :
//  @Query(value="sql 문", countQuery="sql 문2", nativeQuery = true)
//  함수명 : findAllByEnameContaining
    @Query(value = "SELECT E.* FROM TB_EMP E\n" +
            "    WHERE E.ENAME LIKE '%'|| :ename ||'%'",
            countQuery = "SELECT COUNT(*) FROM TB_EMP E\n" +
                    "WHERE E.ENAME LIKE '%'|| :ename ||'%'",
            nativeQuery = true)
    Page<Emp> findAllByEnameContaining(
            @Param("ename") String ename,
            Pageable pageable
    );
}
