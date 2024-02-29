package chap07.sec02.exam01;

/**
 * packageName : chap07.sec02.exam01
 * fileName : Child
 * author : GGG
 * date : 2024-02-07
 * description : TODO: 자식클래스 #2
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-07         GGG          최초 생성
 */
public class Child2 extends Parent {
//    method2 : 재정의, method3() : 그냥 작성

    @Override
    public void method2() {
        System.out.println("자식함수2 - method2");
    }

    public void method3(){
        System.out.println("자식함수2 - method3");
    }
}
