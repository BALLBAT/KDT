package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple018
 * author : ballbat
 * date : 2024-01-30
 * description : 2884	 알람 시계
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         ballbat          최초 생성
 */
public class Simple018 {
    public static void main(String[] args) {
//      시간 표현 : 1) 분에 대해 이전 시간 계산 :
//                   (1) 분 - 45 계산이 양수(또는 0이면)이면 : 계산 결과를 그대로 출력
//                       예) 10시 50분(입력값) - 45분 = 10시 5분
//                        => 시(그대로 출력) , 분(그대로출력)
//                   (2) 분 - 45 계산이 음수이면 : 시 - 1, 분 + 60 - 45
//                       1) 시 - 1 이 음수이면 23시로 수정

        Scanner scanner = new Scanner(System.in);
        int hour   = scanner.nextInt();    // 시간
        int minute = scanner.nextInt();    // 분

//      1) 분계산 = 입력값 - 45;
        int minUpdate = minute - 45;       // 분계산 : 분 - 45;

        if(minUpdate >= 0) {
            // 분 - 45 계산이 양수(또는 0이면)이면 :
            // 시간 분 : 계산 결과를 그대로 출력
            System.out.println(hour + " " + minUpdate);
        } else {
            // 분 - 45 계산이 음수이면
            // 값 수정 :
            //   1) 시간 = 시 - 1,
            //   2) 분   = (분 - 45) + 60
            int hourUpdate = hour - 1;  // 시간 1감소
            minUpdate = minUpdate + 60; // 분 수정(60 더하기)

//          시간 1감소 < 0 => 음수
            if(hourUpdate < 0) {
//                시간 = 23;
                hourUpdate = 23;         // 시간 또 수정(음수이면 23수정)
            }
//        결과 출력
            System.out.println(hourUpdate + " " + minUpdate);
        }
    }
}