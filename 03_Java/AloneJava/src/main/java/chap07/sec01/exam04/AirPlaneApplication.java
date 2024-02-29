package chap07.sec01.exam04;

/**
 * packageName : chap07.sec01.exam04
 * fileName : AirPlaneApplication
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
public class AirPlaneApplication {
    public static void main(String[] args) {
        SuperAirplane superAirplane = new SuperAirplane();

//      비행기 함수 실행
        superAirplane.takeOff();
        superAirplane.fly();
//      비행모드 변경 : 노말 -> 슈퍼
        superAirplane.flyMode = SuperAirplane.SUPER;
        superAirplane.fly();
        superAirplane.land();
    }
}
