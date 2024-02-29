package chap05;

/**
 * packageName : chap05
 * fileName : Verify01
 * author : ballbat
 * date : 2024-01-29
 * description : 종합문제
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-29         ballbat          최초 생성
 */
public class Verify01 {
    public static void main(String[] args) {
//     연습1) 1 ~ 10 까지 배열을 정의하고 출력하세요
//      출력 : 1 2 3 4 5 6 7 8 9 10
//        int[] arr = new int[10];   // 10개 정수배열 정의
//
////      배열값 넣기 : 1 2 3 4 5 6 7 8 9 10
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i+1;  // 배열값 수정
//        }
//
////      출력 : for문
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }



//     연습2) 주어진 배열에서 최대값 구하기
//      출력 : 8
//        int[] array = {1, 5, 3, 8, 2};  // 배열
//        int max = 0;                    // 최대값 임시변수
//      알고리즘 정의 : 1) 배열값 1개를 max 값과 비교
//                    2) 큰값을 max 에 저장
//                    3) 다시 배열값(2번째) max 값과 비교
//                    4) 큰값을 max 에 저장 , 크지않으면 스킵
//                    5) 1~4까지 계속 반복(배열크기만큼)
//                    6) 마지막에는 max 값에 최대값이 들어가 있음(출력)
//      반복문 : 배열크기만큼
//        for (int i = 0; i < array.length; i++) {
////            배열값 1개를 max 값과 비교
//            if(max < array[i]) {
////                큰값을 max 에 저장
//                max = array[i];
//            }
//        }
////      결과 출력 : max(최대값 있음)
//        System.out.println(max);

//      연습 3) 2중 for문을 이용해서 주어지 배열의 전체 항목의 합과 평균을 구해보세요.
////    결과 :
//      TODO: 힌트 : 총합 : 배열값의 합
//                   평균 : 총합/개수(2차원배열값의 개수)
////        sum : 881
////        avg : 88.1

//      알고리즘 정리 : 1) 반복문 : for 2번 실행 why? 2차원 배열
//                    2) 누적합 사용 : sum = sum + 배열값(arr[i][j])
//                    3) 평균 : sum/배열값개수(10)
//      코딩 : 사용할변수를 처음에 정의하기 : 변수의 초기화
//        => 정수:0, 문자열:"", 실수: 0.0 : 기본값 저장
        int[][] array = {{95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}};
        int sum = 0;      // 누적합 변수 정의
        double avg = 0;   // 평균 변수

//        반복문 2번
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];   // 누적합 코드(배열값 누적)
            }
        }
        avg = (double) sum/(double) 10;    // 평균

//      결과 출력
        System.out.println(sum);
        System.out.println(avg);
    }
}
