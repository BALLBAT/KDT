package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple026
 * author : GGG
 * date : 2024-01-30
 * description : 11021	 A+B - 7
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         GGG          최초 생성
 */
public class Simple026 {
    public static void main(String[] args) {
//        첫째 줄에 테스트 케이스 개수 t 주어짐
//        각 테스트는 한 줄이면서 각 줄에 A와 B가 주어짐.
//        출력 : 각 테스트 마다 "Case #x:"를 출력한 다음 A+B의 값을 출력
//             케이스 번호는 1부터 시작

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 1; i <= T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int result = A+B;
            System.out.println("Case #"+i+": "+result);
        }
    }
}
