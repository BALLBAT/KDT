package chap07.verify.exam04;

/**
 * packageName : chap07.verify.exam04
 * fileName : ComputerApplication
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
public class ComputerApplication {
    public static void main(String[] args) {
//  문제 4: 아래 실행 결과를 보고 Computer 객체를 코딩하세요.
        Computer computer = new Computer();

        computer.turnOn(); // "전원을 켭니다." 출력
        computer.displayOn(); // "화면을 켭니다." 출력
        computer.typeOn(); // "타이핑을 합니다." 출력
        computer.turnOff(); // "전원을 끕니다." 출력
    }
}
