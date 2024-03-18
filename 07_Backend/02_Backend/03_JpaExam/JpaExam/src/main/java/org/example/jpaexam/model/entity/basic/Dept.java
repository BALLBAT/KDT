package org.example.jpaexam.model.entity.basic;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/**
 * packageName : org.example.jpaexam.model.entity.basic
 * fileName : Dept
 * author : BALLBAT
 * date : 2024-03-18
 * description : DB 엔티티(JPA 옹여)
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-18         BALLBAT          최초 생성
 */
// 아래 어노테이션 : JPA 어노테이션임
@Entity
@Table(name = "TB_DEPT")
@SequenceGenerator(
        name = "SQ_DEPT_GENERATOR"
        , sequenceName = "SQ_DEPT"
        , initialValue = 1
        , allocationSize = 1
)
@DynamicInsert
@DynamicUpdate
// 롬복 어노테이션 : setter, getter, 생성자, toString 등
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Dept {
//    부서 속성 필드
    @Id
    private Integer dno; // 부서번호
    private String dname; // 부서명
    private String loc; // 부서 위치
}