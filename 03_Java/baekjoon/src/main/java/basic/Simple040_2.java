package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


/**
 * packageName : basic
 * fileName : Simple040_2
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
public class Simple040_2 {
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

//        double[] arr = new double[num];    // 점수배열(3개)
        ArrayList<Double> list = new ArrayList<>(); // 점수배열(3개)

//      점수 입력값 : 3개를 -> list 배열에 넣기
//        배열.length == 향상된배열.size() : 배열의 크기(길이)
        for (int i = 0; i < num; i++) {
            double score = scanner.nextInt(); // 입력 : 40 80 60
//            arr[i] = score;                 // 배열에 넣기
            list.add(score);                  // 향상배열에 넣기
        }

//      디버깅 : 확인 : [40.0, 80.0, 60.0]
//        System.out.println(Arrays.toString(arr));

//      최대값 구하기 코딩 :
        double max = Collections.max(list);    // 최대값 저장할 변수
//        for (int i = 0; i < arr.length; i++) {
//            if(max < arr[i]) {
//                max = arr[i];        // 최대값 코딩
//            }
//        }

//      점수조작 : 0~2 : 향상배열값/최대값*100
        for (int i = 0; i < num; i++) {
//            arr[i] = arr[i]/max*100;        // 점수 조작 (수정)
            list.set(i, list.get(i)/max*100); // 점수 조작 (수정)
        }

//      디버깅 : 확인 (점수조작)
//        System.out.println(":2::" + Arrays.toString(arr));

//      배열값 누적합
        double sum = 0;               // 누적합 변수
        for (int i = 0; i < num; i++) {
//            sum = sum + arr[i];       // 누적합 코드
            sum = sum + list.get(i);    // 누적합 코드
        }
//      평균 = sum/개수(num)
        System.out.println(sum/num);   // 평균
    }
}
