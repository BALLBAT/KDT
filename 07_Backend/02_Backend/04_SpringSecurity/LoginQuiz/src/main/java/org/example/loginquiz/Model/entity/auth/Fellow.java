package org.example.loginquiz.Model.entity.auth;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.example.loginquiz.Model.common.BaseTimeEntity2;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

/**
 * packageName : org.example.loginquiz.Model.entity.auth
 * fileName : Fellow
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
@Entity
@Table(name = "TB_FELLOW")
@DynamicInsert
@DynamicUpdate
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
// soft delete
@Where(clause = "DELETE_YN = 'N'")
@SQLDelete(sql = "UPDATE TB_FELLOW SET DELETE_YN = 'Y', DELETE_TIME=TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') WHERE USER_ID = ?")
public class Fellow extends BaseTimeEntity2 {
//  연습 : Member 가 있는 LoginExam 프로젝트를 참고해서
//    Fellow 가 로그인하는 페이지를 완성하세요
//    id : forbob
//    pwd : 123456
    @Id
    private String userId;

    private String password;
    private String name;
    private String codeName;
}
