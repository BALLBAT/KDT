package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple005
 * author : GGG
 * date : 2024-01-24
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-24         GGG          최초 생성
 */
public class Simple005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        int s = scanner.nextInt();
        double result = (double)f / (double)s;
        System.out.println(result);
    }
}
