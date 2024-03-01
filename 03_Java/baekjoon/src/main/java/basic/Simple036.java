package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple036
 * author : GGG
 * date : 2024-01-31
 * description : 10813	 공 바꾸기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-31         GGG          최초 생성
 */
public class Simple036 {
    public static void main(String[] args) {
//    알고리즘 정리 :
//          1) 바구니 개수 : N
//          1) 바구니 배열 : 개수(N), 초기화(0)
//          2) 반복회수    : M
//          3) 반복문 : 0 ~ M 만큼 실행
//             3-1) 입력 # 1 : 시작 바구니 번호
//             3-2) 입력 # 2 : 끝 바구니 번호
//             3-4) 임시변수 = 1 입력값 저장
//                  배열[입력1인덱스번호] = 입력 2;
//                  배열[입력2인덱스번호] = 임시변수;
//
//      참고) swap 코드 : a변수 <-> b변수의 값 서로 교환하기
//        int a = 1;
//        int b = 2;
//
//        int temp = a; // TODO: temp = a; // a의 값을 임시 보관(1)
//        a = b;        // a=2 바뀜
//        b = temp;     // b=1 바뀜


        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 바구니 개수
        int M = sc.nextInt(); // 반복 횟수

        int[] arr = new int[N]; // 바구니 배열

//      arr : 바구니 배결 : 1,2,3,4,5 넣기
        for (int i = 0; i < N; i++) {
            arr[i] = i+1; // 1,2,3,4,5 원래 시작이 0이라 +1을 해줘야 1부터 시작
        }

//      반복문 : 0 ~ M 까지
//      arr : 바구니 배열, arr[0] = 1, arr[1] = 2, ... arr[4] = 5
//      1번 바구니 번호 == arr[0], 2번 바구니 번호 == arr[1]
        for (int i = 0; i < M; i++) {
            int first = sc.nextInt(); // 1번 바구니 번호
            int second = sc.nextInt(); // 2번 바구니 번호

//          swap 코딩 : 교환 코딩
            int tmp = arr[first-1];        // 1번 바구니 값
            arr[first-1] = arr[second-1]; // 2번 바구니 값 -> 1번 바구니 값 넣기
            arr[second-1] = tmp;          // 임시 변수 값 -> 2번 바구니 값 넣기
        }

//      결과 : arr 배열 : 반복문 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}