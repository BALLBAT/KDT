package chap06.sec05.exam03;

/**
 * packageName : chap06.sec05.exam03
 * fileName : Car
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
public class Car {
    int speed; // 속성(필드)

    public static void main(String[] args) {
//        main() : 전역함수
//      TODO: 같은 클래스내의 속성(필드)라도 바로 사용 불가 : 전역함수
//        this.speed = 60;       // 사용 불가
        Car car = new Car();     // 전역함수일 경우 클래스 생성 후 사용
        car.speed = 60;
        System.out.println(car.speed);
    }
}
