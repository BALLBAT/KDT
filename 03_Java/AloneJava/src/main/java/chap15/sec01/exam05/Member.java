package chap15.sec01.exam05;

import java.util.Objects;

/**
 * packageName : chap15.sec01.exam05
 * fileName : Member
 * author : GGG
 * date : 2024-02-13
 * description : TODO: .hashCode()
 * 요약 :
 *  TODO:
 *      1) 해쉬코드 의미 : 객체를 식별하는 유일한 정수값
 *                       (힙방번호(주소)를 주로 사용)
 *      2) 해쉬코드 함수 : 해쉬코드를 자동 생성해 주는 함수
 *      3) .hashCode() 재정의 대상
 *         - HashMap, HashSet 자료구조 사용시 재정의 안하면
 *           각 각체를 식별할 수 없음
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-13         GGG          최초 생성
 */
public class Member {
    public String id;

    public Member(String id) {
        this.id = id;
    }

//  TODO: .equals() 재정의
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id);
    }

//  TODO: hashCode() 재정의
    @Override
    public int hashCode() {
//        코딩 : 대상 :
//           1) 이 객체를 생성하는 모든 변수는 같은 해쉬코드를 같게 코딩
//           2) 속성(필드)의 해쉬코드 또는 값을 내보내기하면 됨
//              - String 경우 : 속성(필드)의 hashCode 값 내보내기
//              - 일반자료형(int, char 등) : 값만 내보내기
//           3) 해쉬코드 함수를 사용하는 자료구조 때문에 재정의가 필요함
        return id.hashCode();
    }
}
