package chap12.sec02.exam02;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * packageName : chap12.sec02.exam02
 * fileName : LocalDateApplication
 * author : GGG
 * date : 2024-02-15
 * description : TODO: 날짜 클래스 : LocalDate (현재)
 *                 java 8 버전 이후부터 사용
 * 요약 :
 * TODO: 1) 날짜 사용법 : LocalDate 변수 = LocalDate.now();
 *       2) 시간 사용법 : LocalTime 변수 = LocalTime.now();
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-15         GGG          최초 생성
 */
public class LocalDateApplication {
    public static void main(String[] args) {
//        날짜 클래스
        LocalDate localDate = LocalDate.now(); // 현재 날짜
        System.out.println(localDate); // 현재 날짜

//        시간 클래스
        LocalTime localTime = LocalTime.now(); // 현재 시간
        System.out.println(localTime); // 현재 시간
    }
}
