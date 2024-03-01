package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple029
 * author : GGG
 * date : 2024-01-30
 * description : 2439	 별 찍기 - 2
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         GGG          최초 생성
 */
public class Simple029 {
    public static void main(String[] args) {
        //    알고리즘 정리 :
//                1) 별 출력 :
//                  (1) 1행 1열 ~ 1행 4열 : 공백
//                  (2) 1행 5열          : *
//                  (3) 2행 1열 ~ 2행 3열 : 공백
//                  (4) 2행 4열 ~ 5열    : *
//                  => 규칙 찿기 : 1 ~ (num - i) 까지 공백(단, i=1 ~ 5)
//                  =>         : j > (num - i) 는 *  : 안쪽 for문
//                2) print ( 줄바꿈 없이 출력 )

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();         // 개수(반복문횟수)

//        2중 반복문 :
        for (int i = 1; i <= num; i++) {          // 행 : i(1~5)
            for (int j = 1; j <= num; j++) {      // 열 : j(1~5)
//                조건문 힌트 : 규칙) num - i 이하는 공백 출력
//                조건문 힌트 : 규칙) num - i 초과는 * 출력
//                예) i=1 : num=5, 5 - 1 => 공백 4개 출력 , 줄바꿈없음
//                                 5 - 4 => * 1개 출력 , 줄바꿈없음
//                   => 행바뀜(i증가) 줄바꿈
//                    i=2 : num=5, 5 - 2 => 공백 3개 출력 , 줄바꿈없음
//                                 5 - 3 => ** 출력 , 줄바꿈없음
//                   => 행바뀜(i증가) 줄바꿈

            if (j > num - i){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            }
            System.out.println();
        }

////        조건문 힌트
//        if(j > (num - i)) {
////            별찍기
//        } else {
////            공백찍기
//        }
    }
}
