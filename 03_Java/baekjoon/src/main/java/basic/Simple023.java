package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple023
 * author : GGG
 * date : 2024-01-30
 * description : 8393	 합
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         GGG          최초 생성
 */
public class Simple023 {
    public static void main(String[] args) {
//        n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램 작성
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
