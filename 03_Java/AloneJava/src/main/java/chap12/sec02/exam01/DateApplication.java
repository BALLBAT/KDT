package chap12.sec02.exam01;

import java.util.Calendar;
import java.util.Date;

/**
 * packageName : chap12.sec02.exam01
 * fileName : DateApplication
 * author : GGG
 * date : 2024-02-15
 * description : TODO: Date : 날짜 클래스 (과거)
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-15         GGG          최초 생성
 */
public class DateApplication {
    public static void main(String[] args) {
//      Date 날짜 클래스
        Date date = new Date();
        System.out.println(date.toString()); // 현재 날짜

//      추가 날짜 클래스 :
        Calendar calendar = Calendar.getInstance();
//      년 / 월 / 일
        int y = calendar.get(Calendar.YEAR); // 년
        int m = calendar.get(Calendar.MONTH); // 월
        int d = calendar.get(Calendar.DAY_OF_MONTH); // 일

        System.out.println(y+"년 "+m+"월 "+d+"일");
    }
}
