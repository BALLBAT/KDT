package chap15.sec01.exam06;

/**
 * packageName : chap15.sec01.exam06
 * fileName : SmartApplication
 * author : GGG
 * date : 2024-02-13
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-13         GGG          최초 생성
 */
public class SmartApplication {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("삼성", "안드로이드");

//  TODO: 객체 출력 : toString() : 모든 객체에 있음(Object 가 가지고 있기 때문에)
//       => 객체 주소값(해쉬코드)이 문자열로 변환되어 출력됨
//       => 속성(필드)의 값을 출력하는 코딩으로 재정의 필요
        System.out.println(smartPhone.toString());
        System.out.println(smartPhone); // .toString() 생략 가능
    }
}
