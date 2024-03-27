package org.example.loginquiz.Model.common;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Getter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * packageName : org.example.loginquiz.Model.common
 * fileName : BaseTimeEntity
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
@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseTimeEntity2 {
    private String insertTime;
    private String updateTime;
    //  TODO: 삭제 여부 필드 : Y, N (soft delete 용 == update 문 실행)
//    select * from tb_dept where delete_yn = 'N';
    private String deleteYn;
    //  TODO: 삭제 시 시간 필드 (soft delete 용)
    private String deleteTime;

    @PrePersist
    void OnPrePersist(){
//        insert 하기 전에 날짜를 넣기 : 날짜포맷(yyyy-mm-dd HH:mm:ss)
        this.insertTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        this.deleteYn = "N";
    }

    //  TODO: JPA 에서 update 가 실행되기 전에 실행되는 함수
//    예) OnPreUpdate() -> update 실행
    @PreUpdate
    void OnPreUpdate(){
//      update 하기 전에 현재 날짜를 넣기
        this.updateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//      insertTime 같이 변경 (생성일시 == 수정일시 동일하게 처리)
        this.insertTime = this.updateTime;
        this.deleteYn = "N";
    }
}
