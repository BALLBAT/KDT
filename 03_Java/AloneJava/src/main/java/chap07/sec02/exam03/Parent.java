package chap07.sec02.exam03;

/**
 * packageName : chap07.sec02.exam03
 * fileName : Parent
 * author : GGG
 * date : 2024-02-07
 * description : TODO: 부모클래스, 강제 자료형 변환
 * 요약 :
 *      TODO: 강제 자료형변환 : 부모클래스에서 자식클래스로 다시
 *            원상복구할 때 사용하는 형변환을 의미
 *       사용법 : 부모클래스 부모변수 = 자식클래스; // 다형성코드
 *               자식클래스 자식변수 = (자식클래스)부모변수
 *       주의점 : 1) 먼저 부모클래스에 자식클래스가 들어가있어야 복원 가능
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-07         GGG          최초 생성
 */
public class Parent {
    public String field;

//    함수
    public void method1(){
        System.out.println("부모 1");
    }
    public void method2(){
        System.out.println("부모 2");
    }
}
