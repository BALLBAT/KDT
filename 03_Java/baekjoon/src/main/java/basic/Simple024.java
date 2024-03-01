package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple024
 * author : GGG
 * date : 2024-01-30
 * description : 25304	 영수증
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         GGG          최초 생성
 */
public class Simple024 {
    public static void main(String[] args) {
//        알고리즘 정리 :
//        1) 총 금액, 총 개수 2개 입력
//        2) 1 ~ 총 개수까지 반복문 실행
//        3) 물건별 금액(단가*개수) 구해서 누적합 구하기
//        4) 총 금액 == 물건별 금액의 총합 : Yes 아니면 No

        //    첫째 줄 영수증에 적힌 총 금액 X가 주어짐
//    둘째 줄 영수증에 적힌 구매한 물건의 종류의 수 N이 주어짐
//    이후 N개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.

//    구매한 물건의 가격과 개수로 계산한 총금액이 일치하면 Yes 아니면 No 출력
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int N = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            sum = sum+a*b;
            }
        if (sum == X){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}
