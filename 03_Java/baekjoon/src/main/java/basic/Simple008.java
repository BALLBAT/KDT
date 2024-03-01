package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple008
 * author : GGG
 * date : 2024-01-25
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-25         GGG          최초 생성
 */
public class Simple008 {
    public static void main(String[] args) {
//        서기 연도 = 불기 연도 - 543
//        예제에서 불기연도 = y
//        출력해야할 값 = y-543
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println(year-543);
    }
}
