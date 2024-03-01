package basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple033
 * author : GGG
 * date : 2024-01-30
 * description : 10818	 최소, 최대
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         GGG          최초 생성
 */
public class Simple033 {
    public static void main(String[] args) {
//        n개의 정수 주어짐 최솟값과 최댓값 구하기
//        첫째 줄에 정수의 개수 N이 주어지고
//        둘째 줄에는 N개의 정수가 공백으로 구분해서 주어짐
//        첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력

//       알고리즘 정리 :
//          1) 최대값 :
//             1-1) max = 제일작은값; //
//             1-2) 조건문 : max < 입력값 => max = 입력값 저장
//             1-3) 반복문 종료 : max(최대값 있음)
//          2) 최소값 :
//             1-1) min = 제일큰값; //
//             1-2) 조건문 : min > 입력값 => min = 입력값 저장
//             1-3) 반복문 종료 : min(최소값 있음)

//        TODO: 1번 풀이
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        int[] a = new int[n];
//        for (int i = 0; i < a.length; i++) {
//        a[i] = scanner.nextInt();
//        }
//
//        Arrays.sort(a);
//        System.out.println(a[0]+" "+a[n-1]);

//        TODO: 2번 풀이
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//        for(int i=0; i<N; i++){
//            arr[i] = sc.nextInt();
//        }
//        int max = -1000000;
//        int min = 1000000;
//
//        for(int i=0; i<N; i++){
//            if(max <arr[i]){
//                max = arr[i];
//            }
//        }
//
//        for(int i=0; i<N; i++){
//            if(min>arr[i]){
//                min = arr[i];
//            }
//        }
//
//        System.out.print(min+" ");
//        System.out.print(max);

//        TODO: 강사님 풀이
        Scanner scanner = new Scanner(System.in);
        int num         = scanner.nextInt();   // 5 (입력)
        int max         = -1000000;            // 최대값 초기화(제일 작은수)
        int min         = 1000000;             // 최소값 초기화(제일 큰수)

//      반복문 : 0 ~ num 까지 반복
        for (int i = 0; i < num; i++) {
            int temp = scanner.nextInt();      // 20 10 35 30 7

//          최대값 찾기 :조건문 : max < 입력값 => max = 입력값 저장
            if(max < temp) {
                max = temp; // 반복문 횟수만큼 최대값이 수정됨
            }

//          최소값 찾기 : 조건문 : min > 입력값 => min = 입력값 저장
            if(min > temp) {
                min = temp; // 반복문 횟수만큼 최소값이 수정됨
            }
        }

//      반복문 종료 후 max(최대값), min(최소값) 최종 저장됨
        System.out.println(min + " " + max);
        }
    }

