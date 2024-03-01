package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple009
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
public class Simple009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
//        System.out.println(((A+B)%C + "\n" + ((A%C) + (B%C))%C + "\n" + (A*B)%C) + "\n" + ((A%C) * (B%C))%C);

        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C) * (B%C))%C);
    }
}
