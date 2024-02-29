package chap14.sec01.exam03;

/**
 * packageName : chap14.sec01.exam03
 * fileName : Calculator
 * author : GGG
 * date : 2024-02-20
 * description : TODO: 2개의 쓰레드(User1, User2)에서
 *                     공통적으로 실행하는 함수가 있는 클래스 : setMemory()
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-20         GGG          최초 생성
 */
public class Calculator {
    private int memory;

//  getter/setter : alt + insert
    public int getMemory() {
        return memory;
    }

    public synchronized void setMemory(int memory) {
        this.memory = memory;
        try {
            Thread.sleep(2000); // 2초 지연
        } catch (Exception e) {}
        System.out.println(this.memory);
    }
}
