package chap07.sec01.exam06;

/**
 * packageName : chap07.sec01.exam06
 * fileName : SportsCar
 * author : GGG
 * date : 2024-02-07
 * description : TODO: 자식 클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-07         GGG          최초 생성
 */
public class SportsCar extends Car {
//   TODO: 부모클래스를 상속하면 부모클래스의 재산을 모두 사용 가능
//         부모클래스의 재산 = 속성, 생성자, 함수
//   TODO: 함수(메소드) 오버라이딩(재정의) : alt + insert
//      speedUp() : 일반함수 => 함수 재정의 가능
//      stop() : final 함수 => 함수 재정의 불가

    @Override
    public void speedUp() {
        speed += 10;
    }
}
