package chap06.sec02.exam01;

/**
 * packageName : chap06.sec02.exam01
 * fileName : Car
 * author : GGG
 * date : 2024-02-02
 * description : 자동차 클래스
 * 요약 :
 *     TODO: 객체 : 모든 사물, 사람을 지칭함
 *           특징 : 속성 예) 사람 객체 -> 특징 : 이름, 전화번호 등
 *           동작 : 함수 예)         -> 동작 : 학원가다, 학교가다 등
 *           => 객체 생성 : 생성자 함수 사용
 *           객체의 3 요소 : 속성(필드), 함수(메소드), 생성자 함수
 *           => 사용법 : 객체 정의
 *              public class 클래스명(객체명){
 *                  자료형 필드명;
 *                  ...
 *              }
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-02         GGG          최초 생성
 */
public class Car {
//    특징 : 속성(필드)
    String company = "현대자동차";
    String model   = "그랜저";
    String color   = "검정";
    int maxSpeed   = 350;
    int speed;
}
