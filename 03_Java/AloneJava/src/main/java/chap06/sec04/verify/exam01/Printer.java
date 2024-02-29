package chap06.sec04.verify.exam01;

/**
 * packageName : chap06.sec04.verify.exam01
 * fileName : Printer
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
public class Printer {
    void println(int value){
        System.out.println("공유함수(int) : " + value);
    }
    void println(boolean tf){
        System.out.println("공유함수(boolean) : " + tf);
    }
    void println(double up){
        System.out.println("공유함수(double) : " + up);
    }
    void println(String su){
        System.out.println("공유함수(String) : " + su);
    }
}
