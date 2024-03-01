package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple022
 * author : GGG
 * date : 2024-01-30
 * description : 10950	 A+B - 3
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         GGG          최초 생성
 */
public class Simple022 {
    public static void main(String[] args) {


//        테스트 케이스 개수 T가 주어짐
//        각 테스트 케이스는 한줄, 각 줄에 A와 B가 주어짐
//        각 테스트 케이스 마다 A + B를 출력
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

//      2) 반복문 num개까지 실행
        for (int i = 0; i < num; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
//          a+b 출력
            System.out.println(a+b);
        }
    }
}
