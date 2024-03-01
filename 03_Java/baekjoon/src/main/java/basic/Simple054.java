package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple054
 * author : GGG
 * date : 2024-02-02
 * description : 2444	 별 찍기 - 7
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-02         GGG          최초 생성
 */
public class Simple054 {
    public static void main(String[] args) {
//       알고리즘 정리 :
//        힌트 : 1) 규칙
//                 1-1) 행 반복문(i) 윗별 : 1 ~ num 까지 반복됨 1증가
//                    1-1-1) 열 반복문(j)
//                     -> 공백  : 0 ~ num-i 까지 반복되며 출력됨
//                     -> 별(*) : 0 ~ 2xi -1 개까지 반복되며 출력됨
//                    1-1-2) 줄바꿈
//                 1-2) 행 반복문(i) 아래별 : num-1 ~ 0 까지 1감소
//                    1-1-1) 열 반복문(j)
//                     -> 공백  : 0 ~ num-i 까지 반복되며 출력됨
//                     -> 별(*) : 0 ~ 2xi -1 개까지 반복되며 출력됨
//                    1-1-2) 줄바꿈
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();       // 입력 : 5

//     1-1) 행 반복문(i) 윗별 : 1 ~ num 까지 반복됨 1증가
        for (int i = 1; i <= num; i++) {        // 행(줄바꿈)
//            1-2) 공백 : 0 ~ num-i 까지(줄바꿈 없음)
//            1행(i=1) : num-i : 5-1 = 4 -> 공백 4개 찍힘
//            1행(i=2) : num-i : 5-2 = 3 -> 공백 3개 찍힘
//            1행(i=3) : num-i : 5-3 = 2 -> 공백 2개 찍힘
            for (int j = 0; j < num-i; j++) {   // 열 : 공백
                System.out.print(" ");
            }
//            1-3) 별(*) : 0 ~ 2xi-1(홀수:1,3,5,7..) 개까지 반복되며 출력됨
//          i행(i=1) : 2*i-1 : 2*1-1 = 1 -> 별 1개 찍힘
//          i행(i=2) : 2*i-1 : 2*2-1 = 3 -> 별 3개 찍힘
//          i행(i=3) : 2*i-1 : 2*3-1 = 5 -> 별 5개 찍힘
            for (int j = 0; j < 2*i -1; j++) {   // 열 : *
                System.out.print("*");
            }
            System.out.println();                // 줄바꿈
        }
//     1-2) 행 반복문(i) 아래별 : num-1 ~ 0 까지 반복됨 1감소
        for (int i = num-1; i >= 0; i--) {        // 행(줄바꿈)
//            1-2) 공백 : 0 ~ num-i 까지(줄바꿈 없음)
            for (int j = 0; j < num-i; j++) {   // 열 : 공백
                System.out.print(" ");
            }
//            1-3) 별(*) : 0 ~ 2xi-1(홀수:1,3,5,7..) 개까지 반복되며 출력됨
            for (int j = 0; j < 2*i -1; j++) {   // 열 : *
                System.out.print("*");
            }
            System.out.println();                // 줄바꿈
        }
    }
}
