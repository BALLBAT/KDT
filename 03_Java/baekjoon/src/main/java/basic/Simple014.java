package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple014
 * author : ballbat
 * date : 2024-01-29
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-29         ballbat          최초 생성
 */
public class Simple014 {
    public static void main(String[] args) {
//        두 정수 A와 B가 주여졌을 때 비교
//        입력함수
        Scanner scanner = new Scanner(System.in);
//        변수 설정
        int A = scanner.nextInt();
        int B = scanner.nextInt();

//        조건문 제시
        if (A > B){
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}
