package chap07.sec02.exam02;

/**
 * packageName : chap07.sec02.exam02
 * fileName : DriverApplication
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
public class DriverApplication {
    public static void main(String[] args) {
//        Driver class 생성 : drive(Vehicle vehicle){}
//        class 변수 = new 생성자함수();
        Driver driver = new Driver();

//        자식 class 2개 : Taxi, Bus 생성
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

//      TODO: 다형성 실행 : 함수 이용
//        Driver class 생성 : drive(Vehicle vehicle){}
        driver.drive(bus); // 다형성 : 함수의 매개변수 이용
        driver.drive(taxi); // 다형성 : 함수의 매개변수 이용
    }
}
