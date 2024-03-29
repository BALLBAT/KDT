package chap07.verify.exam07;

/**
 * packageName : chap07.verify.exam07
 * fileName : PrinterApplication
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
public class PrinterApplication {
    public static void main(String[] args) {
//  문제 : 아래 실행클래스의 실행 결과와 부모클래스 Printer 객체를 확인하고,
//        LaserPrinter 자식 객체를 코딩하세요 : (함수(메소드) 재정의 문제)
        //      부모 객체 생성
        Printer printer = new Printer();
        printer.powerOn(); //   "전원켜기"
        printer.print();     // "기본 프린터 입니다. 기본사양으로 프린팅합니다."

//      자식 객체 생성
        LaserPrinter laserPrinter = new LaserPrinter();
        laserPrinter.print();    // "레이저프린터로 프린트합니다. 고급 사양으로 프린팅합니다."
        laserPrinter.powerOff();  // "전원끄기"
    }
}
