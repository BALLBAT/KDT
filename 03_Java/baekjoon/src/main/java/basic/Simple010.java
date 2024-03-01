package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple010
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
public class Simple010 {
    public static void main(String[] args) {
//        3자리수 2번의 입력
        Scanner scanner = new Scanner(System.in);

//        입력 변수 설정
        int A = scanner.nextInt();
        int B = scanner.nextInt();

//        출력
        System.out.println(A*(B%10));     // 2360
        System.out.println(A*(B%100/10)); // 3776
        System.out.println(A*(B/100));    // 1416
        System.out.println(A*B);          // 181720
//        4번의 출력 필요함
//        1번 입력 수 * 2번 입력 1의 자릿수   (B%10)
//        1번 입력 수 * 2번 입력 10의 자릿수  (B%100/10)
//        1번 입력 수 * 2번 입력 100의 자릿수 (B/100)
//        1번 입력 수 * 2번 입력 수의 값
    }
}
