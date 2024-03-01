package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple035
 * author : GGG
 * date : 2024-01-30
 * description : 10810	 공 넣기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         GGG          최초 생성
 */
public class Simple035 {
    public static void main(String[] args) {
//      첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
//      둘째 줄부터 M개의 줄에 걸쳐서 공을 넣는 방법이 주어진다.
//      각 방법은 세 정수 i j k로 이루어져 있으며,
//      i번 바구니부터 j번 바구니까지 k번 번호가 적힌 공을 넣는다는 뜻이다.

//      출력 : 1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다
//            공이 들어있지 않은 바구니는 0을 출력한다.

//      N : 바구니 수
//      M : 줄의 수

//      알고리즘 정리 :
//        1) 바구니 개수 : N
//        1-1) 바구니 배열 : 초기화(0)
//        2) 반복 횟수 : M
//        3) 반복문 : 0 ~ M 만큼 실행
//        3-1) 입력 # 1 : 시작 바구니 번호
//        3-2) 입력 # 2 : 끝 바구니 번호
//        3-3) 입력 # 3 : 공번호
//        3-4) 반복문 # 2 : 안쪽 for 문 : (시작바구니 ~ 끝바구니)


        Scanner scanner = new Scanner(System.in);

        int basket = scanner.nextInt(); // 바구니 개수
        int num    = scanner.nextInt(); // 반복 횟수

//        배열정의 : 자료형[] 변수 = new 자료형 [개수];
        int[] arr = new int[basket];  // 바구니 배열(공넣기)

//        반복문 : 0 ~ num 까지 반복
        for (int i = 0; i < num; i++) {
            int first = scanner.nextInt(); // 1st 바구니 번호
            int second = scanner.nextInt(); // 2nd 바구니 번호
            int ball = scanner.nextInt(); // 공 번호

//        반복문 #2 : first ~ second 까지 반복
            for (int j = first; j <= second; j++) {
                arr[j-1] = ball;   // 공 넣기
            }
        }
//        결과 출력 : arr 배열
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
