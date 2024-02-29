package chap06.sec03.exam02;

/**
 * packageName : chap06.sec03.exam02
 * fileName : KoreanApplication
 * author : GGG
 * date : 2024-02-02
 * description : Main{}
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-02         GGG          최초 생성
 */
public class KoreanApplication {
    public static void main(String[] args) {
//                한국인 객체를 생성
//        매개변수 2개짜리 생성자를 이용해서 속성을 초기화하세요.
//        초기화 한 결과를 출력하세요.
//        name 속성(필드), ssn 속성(필드)
//        결과 :
//            박자바
//            011225-1234567 (문자열)
//            김자바
//            930525-0654321
//        2개짜리 매개변수 생성자 호출하면서 속성 초기화됨
//        TODO: 클래스 생성 : 클래스 변수 = new 생성자함수();
        Korean korea = new Korean("박자바", "011225-1234567");
        Korean korea2 = new Korean("김자바", "930525-0654321");

        System.out.println(korea.Name);
        System.out.println(korea.Ssn);
        System.out.println(korea2.Name);
        System.out.println(korea2.Ssn);
    }
}
