package chap06.sec05.exam01;

/**
 * packageName : chap06.sec05.exam01
 * fileName : CarApllication
 * author : GGG
 * date : 2024-02-05
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-05         GGG          최초 생성
 */
public class CarApllication {
    public static void main(String[] args) {
//        클래스 생성
        Car car = new Car("벤츠");

//        저장 함수 : setter
        car.setSpeed(10); // speed 속성 10으로 저장됨
//      car.speed = 10; // 비추
//      System.out.println(car.speed); // 비추
        System.out.println(car.getSpeed()); // 추천
    }
}
