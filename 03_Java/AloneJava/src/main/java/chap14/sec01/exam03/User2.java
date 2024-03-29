package chap14.sec01.exam03;

/**
 * packageName : chap14.sec01.exam03
 * fileName : User2
 * author : GGG
 * date : 2024-02-20
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-20         GGG          최초 생성
 */
public class User2 extends Thread{
    private Calculator calculator;

//  setter
    public void setCalculator(Calculator calculator) {
        this.setName("User2"); // 쓰레드에 이름 부여하는 함수
        this.calculator = calculator;
    }

//  함수 재정의 : run()
    @Override
    public void run() {
        calculator.setMemory(100);
    }
}
