package chap09.exam01;

import java.util.Optional;

/**
 * packageName : chap09.exam01
 * fileName : OptionalApplication
 * author : GGG
 * date : 2024-02-19
 * description : TODO: Optional 클래스
 * 요약 :
 * TODO: 1) 자바의 문제점 : null 포인트 에러가 언제든지 발생할 수 있음
 *          => 파이썬 : null 포인트 에러 없음
 *          => 자바 최신 버전에 새로운 Optional Class 소개됨
 *             (null 에러 방지 클래스)
 *       2) Optional 클래스 : Wrapper 클래스 종류
 *          예) int -> Integer 등 (객체자료형, 래퍼클래스)
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-19         GGG          최초 생성
 */
public class OptionalApplication {
    public static void main(String[] args) {
//      TODO: 옵셔널에 값 넣기 : Optional<자료형> 변수 = Optional.of(값);
//        <자료형> : 제네릭 : 넣는 값의 자료형을 제한하는 것
        Optional<String> str = Optional.of("abcde");

//      TODO: 옵셔널에서 다시 값을 꺼내기 : 변수.get()
        System.out.println(str.get());

//      TODO: 정수 넣기
        Optional<Integer> num = Optional.of(0);

//      TODO: 옵셔널에 정수 값 있는지 확인 : 변수.isPresent()
        System.out.println(num.isPresent()); // 있으면 true

//      TODO: 빈 객체 : 변수.empty();
        Optional optional = Optional.empty(); // 빈 객체 저장됨
        System.out.println(optional.isPresent()); // 없으니까 false

//      TODO: 만약 빈 객체이면 대체 문자열 출력하기 : 변수.orElse(값) : null 에러 방지됨
        System.out.println(optional.orElse("값 없음")); // null 에러방지
    }
}
