package chap15.sec01.exam06;

/**
 * packageName : chap15.sec01.exam06
 * fileName : SmartPhone
 * author : GGG
 * date : 2024-02-13
 * description : TODO: .toString()
 * 요약 :
 *      TODO:
 *       1) toString() : 개체의 정보를 출력하는 함수
 *                       (객채를 문자열로 변환해서 출려하는 함수)
 *       2) 코딩 : 속성의 값을 내보내기 하면 됨
 *          => why? 안하면 주소값이 문자열로 출력됨
 *       3) 자동화 기능 이용 : alt + insert
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-13         GGG          최초 생성
 */
public class SmartPhone {
    private String company; // 회사명
    private String os; // 운영체제

    public SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;
    }

//  TODO: toString() 재정의
//    코딩 : 속성의 값을 내보내기 하면 됨
    @Override
    public String toString() {
//      속성(필드) : company, os (문자열)
        return this.company + "," + this.os;
    }
}

