package chap07.verify.exam03;

/**
 * packageName : chap07.verify.exam03
 * fileName : PointApplication
 * author : GGG
 * date : 2024-02-06
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-06         GGG          최초 생성
 */
public class PointApplication {
    public static void main(String[] args) {
// 연습문제 2: 아래 실행 클래스를 보고 Point 객체를 코딩하세요.
//    속성의 변수명은 x, y 로 하세요
// 결과 :
//     (0,0)
//     (10,20)

//    객체 생성
        Point point = new Point(); // 기본생성자로 객체생성
        System.out.println("(" + point.x + ", " + point.y + ")");; // (0,0) 출력

//    객체 생성2
        Point point2 = new Point(10,20); // 매개변수 2개짜리 생성자로 객체 생성
        System.out.println("(" + point2.x + ", " + point2.y + ")");; // (10,20) 출력

    }
}
