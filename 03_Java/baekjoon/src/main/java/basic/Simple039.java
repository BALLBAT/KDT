package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple039
 * author : GGG
 * date : 2024-01-31
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-31         GGG          최초 생성
 */
public class Simple039 {
    public static void main(String[] args) {
//       알고리즘 정리 :
//          0) 해석) 시작바구니값~ 끝바구니값을 서로 교환하고, 시작바구니번호1증가
//                 끝바구니번호1감소해서 다시 서로 교환, 계속 반복
//                 (단, 시작바구니번호 < 끝바구니번호 임)
//          1) 바구니 개수 : N
//          1) 바구니 배열 : 개수(N), 초기화(1,2,3,4,5)
//          2) 반복회수    : M
//          3) 반복문 : 0 ~ M 만큼 실행
//             3-1) 입력 # 1 : 시작 바구니 번호
//             3-2) 입력 # 2 : 끝 바구니 번호
//             3-3) 반복문 #2 : 입력#1 < 입력#2 일 경우만 반복
//                  3-3-1) 임시변수 = 1 입력값 저장
//                         배열[입력1인덱스번호] = 입력 2;
//                         배열[입력2인덱스번호] = 임시변수;
//                         입력#1 1증가 (1증가 값 교환)
//                         입력#2 1감소 (1감소 값 교환)
//        4) 바구니 배열 값 출력
        Scanner scanner = new Scanner(System.in);
        int basket = scanner.nextInt();  // 바구니 개수
        int num    = scanner.nextInt();  // 반복 횟수

        int[] arr = new int[basket];     // 배열 정의 (바구니 개수)

//      바구니 배열 값 : 1,2,3,4,5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1; // 1,2,3,4,5
        }

//      3) 반복문 : 0 ~ num 만큼 실행
        for (int i = 0; i < num; i++) {
            int first = scanner.nextInt()-1;   // 1이어야하는데, 배열인덱스 : 0
            int second = scanner.nextInt()-1;  // 그래서 -1을 해줌

//      3-3) 반복문 #2 : 입력#1 < 입력#2 일 경우에만 반복 : 교환
//      1 2 3 4 -> 4 2 3 1 -> 4 3 2 1
            while (first<second){
//             swap 코딩
                int temp = arr[first];  // 시작 바구니값 -> 임시변수 저장
                arr[first] = arr[second]; // 끝바구니값 -> 시작바구니값 변경
                arr[second] = temp;       // 시작바구니값 -> 끝바구니값 변경 완

//             시작 바구니 번호 == 배열 인덱스 번호
                first++;
//             끝 바구니 번호 == 배열 인덱스 번호
                second--;
            }
        }
//      최종 값 : arr 배열 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
