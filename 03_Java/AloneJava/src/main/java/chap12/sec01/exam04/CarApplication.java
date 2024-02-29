package chap12.sec01.exam04;

/**
 * packageName : chap12.sec01.exam04
 * fileName : CarApplication
 * author : GGG
 * date : 2024-02-15
 * description : TODO: Class 클래스
 * 요약 :
 * TODO: 1) 일반 클래스의 정보를 보는 클래스 : 패키지, 클래스명 등
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-15         GGG          최초 생성
 */
public class CarApplication {
    public static void main(String[] args) {
//      Car.java : 소스 -> 컴파일(빌드) -> Car.class
        Class clazz = Car.class; // 클래스 파일 이름

//      Car 클래스 정보 보기
        System.out.println(clazz.getPackage().getName()); // 패키지 정보
        System.out.println(clazz.getName()); // 패키지 + 클래스명 정보
        System.out.println(clazz.getSimpleName()); // 클래스명 정보
    }
}
