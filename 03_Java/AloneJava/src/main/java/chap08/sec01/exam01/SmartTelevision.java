package chap08.sec01.exam01;

/**
 * packageName : chap08.sec01.exam01
 * fileName : SmartTelevision
 * author : GGG
 * date : 2024-02-08
 * description : TODO: 자식클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08         GGG          최초 생성
 */
public class SmartTelevision implements RemoteControl, Searchable {
    private int volume;

//    함수 : 재정의(오버라이딩) : alt + insert

    @Override
    public void turnOn() {
        System.out.println("TV 를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV 를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
//      조건문 : 매개변수 값이 1 ~ 10 사이에만 허용되도록 코딩
        if (volume > RemoteControl.MAX_VOLUME){ // 10
            this.volume = RemoteControl.MAX_VOLUME; // 10을 this.volume 에 넣음
        } else if (volume < RemoteControl.MIN_VOLUME) { // 1
            this.volume = RemoteControl.MIN_VOLUME; // 1을 this.volune 에 넣음
        } else {
            this.volume = volume;
        }
        System.out.println("현재 볼륨 : " + this.volume); // 출력
    }

    @Override
//------------------------------------------------------------------------------------
//    Searchable 인터페이스 함수 재정의
    public void search(String url) {
        System.out.println(url + " 검색합니다.");
    }
}
