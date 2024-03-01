package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple032
 * author : GGG
 * date : 2024-01-30
 * description : 10871	 X보다 작은 수
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         GGG          최초 생성
 */
public class Simple032 {
    public static void main(String[] args) {
//      입력 : 정수 2개, 밑에 숫자들 : 정수(반복문 안에)
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 1st 입력 : 10
        int X = scanner.nextInt(); // 2nd 입력 : 5 (비교대상숫자)

//      반복문을 N까지 실행
        for (int i = 0; i < N; i++) {
            int temp = scanner.nextInt(); // 1 10 4 9 2 3 8 5 7 6
//          비교 : 작은수(temp(입력값) < X) 출력
            if (temp < X){
                System.out.print(temp+ " "); // 결과 출력(줄바꿈 없음)
            }
        }
    }
}
