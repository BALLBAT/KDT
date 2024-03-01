package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple028
 * author : GGG
 * date : 2024-01-30
 * description : 2438	 별 찍기 - 1
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         GGG          최초 생성
 */
public class Simple028 {
    public static void main(String[] args) {
//    알고리즘 정리 :
//    1) 1행 : *
//    2) 2행 : **
//    3) 3행 : ***
//    ...
//    2중 for 문 : 행(바깥쪽 for문), 열(안쪽 for문)

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
