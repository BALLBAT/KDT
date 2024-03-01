package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple030
 * author : GGG
 * date : 2024-01-30
 * description : 10952	 A+B - 5
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         GGG          최초 생성
 */
public class Simple030 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        무한 반복문
        while (true) {
            int num = scanner.nextInt();
            int num2 = scanner.nextInt();
            int result = num+num2;

//         반복문 중단 조건 : 1 입력 (0), 2 입력(0)
            if (num==0 && num2==0){
                break;
            }
            System.out.println(result);
        }
    }
}
