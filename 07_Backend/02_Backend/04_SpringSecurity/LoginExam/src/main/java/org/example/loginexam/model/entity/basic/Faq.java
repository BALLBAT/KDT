package org.example.loginexam.model.entity.basic;

import jakarta.persistence.*;
import lombok.*;
import org.example.loginexam.model.common.BaseTimeEntity;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/**
 * packageName : org.example.jpaexam.model.entity.basic
 * fileName : Faq
 * author : BALLBAT
 * date : 2024-03-21
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-21         BALLBAT          최초 생성
 */
@Entity
@Table(name = "TB_FAQ")
@SequenceGenerator(
        name = "SQ_FAQ_GENERATOR"
        , sequenceName = "SQ_FAQ"
        , initialValue = 1
        , allocationSize = 1
)
@DynamicInsert
@DynamicUpdate
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Faq extends BaseTimeEntity {
//    TODO: 종합 연습 문제 : 부서게시판 샘플을 참고하여 Faq 게시판을 만드세요 : 함수명, url 자유'
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE
        , generator = "SQ_FAQ_GENERATOR"
)
    private Integer fno; // 게시판 번호
    private String title; // 제목
    private String content; // 내용
}
