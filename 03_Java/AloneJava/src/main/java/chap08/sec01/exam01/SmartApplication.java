package chap08.sec01.exam01;

/**
 * packageName : chap08.sec01.exam01
 * fileName : SmartApplication
 * author : GGG
 * date : 2024-02-08
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08         GGG          최초 생성
 */
public class SmartApplication {
    public static void main(String[] args) {
//      클래스 생성 : 클래스 변수 = new 생성자함수();
    SmartTelevision smartTelevision = new SmartTelevision();

//    인터페이스에 위의 클래스 저장
//    TODO: 인터페이스 변수명 = 자식클래스;
//      잘못된 사용법 : 인터페이스 변수명 = new 인터페이스명(); - X
        RemoteControl remoteControl = smartTelevision;
        Searchable searchable = smartTelevision;

        remoteControl.turnOn();     // tv 켜기
        remoteControl.setVolume(7); // 볼륨 변경 : 7번
//        인터넷 검색 기능
        searchable.search("www.naver.com");
        remoteControl.turnOff();    // tv 끄기
    }
}
