package basic;

import java.util.Arrays;
import java.util.Scanner;


/**
 * packageName : basic
 * fileName : Simple040
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
public class Simple040 {
    public static void main(String[] args) {
//       알고리즘 정리 :
//          0) 해석) 세준이 점수 : 40 80 60
//               -> 조작 : 점수/최대값*100
//                   1) 40/80 * 100 = 50
//                   2) 80/80 * 100 = 100
//                   3) 60/80 * 100 = 75
//                   => 조작점수의 평균을 출력하세요
//        TODO: 힌트 : ArrayList 이용 -> Collections.max(arraylist)
        Scanner scanner = new Scanner(System.in);
        int num      = scanner.nextInt();  // 반복횟수 : 3
        double[] arr = new double[num];    // 점수배열(3개)

//      점수 입력값 : 3개를 -> arr 배열에 넣기
        for (int i = 0; i < arr.length; i++) {
            double score = scanner.nextInt(); // 입력 : 40 80 60
            arr[i] = score;                   // 배열에 넣기
        }

//      디버깅 : 확인 : [40.0, 80.0, 60.0]
        System.out.println(Arrays.toString(arr));

//      최대값 구하기 코딩 :
        double max = 0;              // 최대값 저장할 변수
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];        // 최대값 코딩
            }
        }
    }
}
