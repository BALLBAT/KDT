package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple027
 * author : GGG
 * date : 2024-01-30
 * description : 11022	 A+B - 8
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         GGG          최초 생성
 */
public class Simple027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 1; i <= T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int result = A+B;

            System.out.println("Case #"+i+ ": " + A + " + " + B + " = " + result);
        }
    }
}
