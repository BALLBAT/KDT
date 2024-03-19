package org.example.jpaexam.repository.basic;

import org.example.jpaexam.model.entity.basic.Emp;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * packageName : org.example.jpaexam.repository.basic
 * fileName : EmpRepository
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
public interface EmpRepository extends JpaRepository<Emp, Integer> {
    @Query(value = "SELECT E.* FROM TB_EMP E\n" +
            "    WHERE E.ENAME LIKE '%'|| :ename ||'%'",
            countQuery = "SELECT COUNT(*) FROM TB_EMP E\n" +
                    "WHERE E.ENAME LIKE '%SA%'",
            nativeQuery = true)
    Page<Emp> findAllByEnameContaining(
            @Param("ename") String ename,
            Pageable pageable
    );
}
