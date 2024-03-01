package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple017
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
public class Simple017 {
    public static void main(String[] args) {
//        1 ~ 4 사분면 출력하기
//        정수 x 와 y 가 주어진다.
//        x = 양수, y = 양수 -> 1사분면
//        x = 음수, y = 양수 -> 2사분면
//        x = 음수, y = 음수 -> 3사분면
//        x = 양수, y = 음수 -> 4사분면

//        입력함수
        Scanner scanner = new Scanner(System.in);

//        입력 값 설정
        int x = scanner.nextInt();
        int y = scanner.nextInt();

//        조건문 설정
        if(0 < x && 0 < y){
            System.out.println(1);
        } else if (x < 0 && 0 < y) {
            System.out.println(2);
        } else if (x < 0 && y < 0) {
            System.out.println(3);
        } else if (0 < x && y < 0){
            System.out.println(4);
        }
    }
}