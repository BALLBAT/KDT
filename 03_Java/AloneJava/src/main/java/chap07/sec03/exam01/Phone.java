package chap07.sec03.exam01;

/**
 * packageName : chap07.sec03.exam01
 * fileName : Phone
 * author : GGG
 * date : 2024-02-07
 * description : TODO: 추상클래스
 * 요약 :
 *      TODO: 사용법 : abstract class 클래스명{}
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-07         GGG          최초 생성
 */
public abstract class Phone {
    public String owner;

//  생성자 : 1개

    public Phone(String owner) {
        this.owner = owner;
    }

//    함수 : 전원켜기
    public void turnOn(){
        System.out.println("전원켜기");
    }
//    함수 : 전원끄기
    public void turnOff(){
        System.out.println("전원끄기");
    }
}
