package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple021
 * author : GGG
 * date : 2024-01-30
 * description : 2739	 구구단
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         GGG          최초 생성
 */
public class Simple021 {
    public static void main(String[] args) {
//        알고리즘 정리 :
//          1) 2단 고정(입력값) : 반복문 1 ~ 9까지 실행
//             => 결과 : 2(입력값) x i(1~9) = 2*i(1~9)
//                예시) 2 x 1 = 2
//          2) 계산 결과 나오면 바로 화면 출력


//        첫째 줄 N이 주어지고 N은 1보다 크거나 같고, 9보다 작거나 같다.
//        N * 1 부터 N * 9 까지 출력
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(n+" * " + i + " = " + (n*i));
        }
    }
}
