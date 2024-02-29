package chap07.sec02.exam03;

/**
 * packageName : chap07.sec02.exam03
 * fileName : ChildApplication
 * author : GGG
 * date : 2024-02-07
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-07         GGG          최초 생성
 */
public class ChildApplication {
    public static void main(String[] args) {
//      Parent 함수 : method1(), method2()
//      Child 함수 : method3()
        Parent parent = new Child(); // 다형성 (자동형변환)
//        parent.method3(); // 사용불가(자식함수)
//      TODO: 강제 (자료)형변환
//        (자료형) : 캐스팅 연산자 예) int a = long
        Child child = (Child) parent; // 캐스팅 연산자 사용
        child.method3(); // 사용가능
    }
}