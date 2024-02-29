package chap07.sec02.exam01;

/**
 * packageName : chap07.sec02.exam01
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
//        TODO: 클래스 생성 : 클래스 변수 = new 생성자함수();
//          클래스 == 객체 == 인스턴스
//      자식클래스
        Child child = new Child();
        Child2 child2 = new Child2();

//      TODO: 부모클래스 : 부모클래스에 자식클래스를 넣기(대입(=)), 상속관계
//         => 효과 : 재정의된 함수가 있으면 자식함수가 실행됨
//         => 장점 1) 코드는 수정을 최소화하고 실행클래스에 다양한 결과를 만들어낼 수 있음
//        Parent parent = child;
        Parent parent = child2;
//      겉모습은 부모클래슨데 속은 자식클래스면 자식 쪽 함수가 실행된다.
//      이게? 다형성

        parent.method1(); // 부모함수
//      method2() : 부모와 자식 동시에 존재
        parent.method2(); // TODO: 부모함수? 자식함수? 둘중 어느게 실행될까
//      => 자식함수가 실행됨
    }
}
