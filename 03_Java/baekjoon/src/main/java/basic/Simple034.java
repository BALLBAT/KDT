package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple034
 * author : GGG
 * date : 2024-01-30
 * description : 2562	 최댓값
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         GGG          최초 생성
 */
public class Simple034 {
    public static void main(String[] args) {
//        TODO: 참조 풀이
//        Scanner scanner = new Scanner(System.in);
//        int Num[] = new int[9]; // Num 배열을 만들고 = 배열의 길이 설정

//        int Max = 0;  // 최대값의 변수
//        int MaxCount = 0; // 최대값의 위치의 변수

//        for (int i = 0; i < Num.length; i++) { // 입력에 대한 반복문
//            Num[i] = scanner.nextInt(); // 입력값

//            for (int j = 0; j < Num.length; j++) { // 출력을 위한 반복문
//                if (Num[j] > Max){ // Num배열의 값이 Max 값 보다 클 때
//                    Max = Num[j];  // Max는 Num 배열 내의 값
//                    MaxCount = j+1; // MaxCount는 Num 배열 번호 + 1
//                }
//            }
//        }
//        System.out.println(Max);
//        System.out.println(MaxCount);

//      TODO: 강사님 풀이
        Scanner scanner = new Scanner(System.in);
        int max = 0; // 최대값 초기화(제일 작은수)
        int index = 0; // 최대값 찾았을 때 저장할 순번(i) 변수

//        조건 : 자연수 9개가 무조건 들어온다.
        for (int i = 0; i < 9; i++) {
            int num = scanner.nextInt(); // 3 29 ...

//        최대값 찾기 : max < 입력값 => (참) max = 입력값;
            if (max < num){
                max = num; // 조건에 맞게 반복문 횟수만큼 실행되어 최대값이 수정됨
                index = i+1; // 최대값 찾았을 때 저장할 순번(i) 변수
            }
        }
//        최대값, 누적합, 최소값 : 반복문 종료 후에 출력해야함
        System.out.println(max);
        System.out.println(index);


    }
}
