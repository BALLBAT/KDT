package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple015
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
public class Simple015 {
    public static void main(String[] args) {
//        시험 점수 입력받는다.
//        90 ~ 100 점은 A
//        80 ~ 89 점은 B
//        70 ~ 79 점은 C
//        60 ~ 69 점은 D
//        나머지 점수는 F 출력

//        입력 함수
        Scanner scanner = new Scanner(System.in);

//        변수 설정
        int score = scanner.nextInt();

//        조건문
        if (90 <= score && score <= 100){
            System.out.println("A");
        } else if (80 <= score && score <= 89) {
            System.out.println("B");
        } else if (70 <= score && score <= 79) {
            System.out.println("C");
        } else if (60 <= score && score <= 69) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
