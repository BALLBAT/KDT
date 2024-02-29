package chap04;

/**
 * packageName : chap04
 * fileName : Sec02
 * author : GGG
 * date : 2024-01-25
 * description : 반복문 for문
 * 요약 :
 *      TODO: 알고리즘 : 주로 어떤 문제를 해결하기 위한 절차 및 알려진 해법
 *       => 1) 누적합 알고리즘
 *       => 2) 호제법 : 최대공약수, 최소공배수 구하는 알고리즘
 *       => 3) 복잡한 문제 => 나누어서(쪼개서) 각각 구하고 다시 합치기
 *             => 분할 정복 알고리즘
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-25         GGG          최초 생성
 */
public class Sec02 {
    public static void main(String[] args) {
        //        TODO: 1 ~ 100 까지 합 출력하기 :
//            누적합 코드 :
//            자바 사용법 : for(int 변수 = 초기값; 조건식; 증감식) {반복문;}
//        int sum = 0; // 합 변수
//        fori : for문 자동완성
//        for (int i = 1; i <= 100; i++) {
//          이후 sum = 이전 sum + 누적시킬 값;
//            sum = sum + i; // 누적합 코드 : 알고리즘 패턴
//        }
//        System.out.println(sum); // 결과 (모든 숫자 합)

//        TODO: 연습 1) 구구단 출력하기
//                     2단 출력하기 (규칮찾기)
//               => 2(그대로), x(그대로), 1~9(1씩 증가), =(그대로), (2x1 결과)
//              결과 : 2 x 1 = 2
//              결과 : 2 x 2 = 4
//              결과 : ...
//              결과 : 2 x 9 = 18
//        2씩 증가

//        for (int i = 1; i <= 9 ; i++) {
//            System.out.println("2 x "+i+" = "+(2*i));
//
//        }

//        TODO: 연습 2) 구구단 출력하기
//              2 ~ 9단까지 출력
//         힌트 : for문 2번 사용 : 중첩 for문 : for(){for()}
//         1) 위의 2단 코드를 8번 반복
//        for (int i = 2; i <= 9 ; i++) {
//            for(int e = 1; e <= 9; e++) {
//                TODO: 2) (고정아님) => 2 (2 ~ 9까지 변하는 숫자 : i)
//                System.out.println(i + " x " + e + " = " + (i * e));
//            }
//        }

//        TODO: 연습 3) 1 ~ 10 까지 사이의 수 중에서 짝수를 출력하기
//          힌트) %(나머지 연산자)
//        for (int i = 1; i < 11; i++) {
//            조건식이 짝수인가?
//            if (i % 2 == 0){
//                System.out.println(i); // i 짝수
//            }

//        }

//        TODO: 연습 4) 1 ~ 100까지 정수 중에서 3의 배수의 총합을 구하는 코드 작성
//        int sum = 0;
//
//        for (int i = 1; i <= 100; i++) {
//            if(i % 3 == 0){
//                sum = sum + i;
//            }
//        }
//        System.out.println(sum);

//        TODO: 연습 5) 2중 for문을 이용해서 4x + 5y = 60의 모든 해를 구해서 (x, y) 형태로 출력해 보세요.
//         단 ,x와 y는 10 이하의 자연수( 1 ~ 10까지 )
//         결과 :
//             (5, 8)
//             (10, 4)
//        for (int x = 1; x <= 10; x++) {
//            for (int y = 1; y <= 10; y++) {
//                if((4*x)+(5*y) == 60){
//                    System.out.println("("+x+","+" "+y+")");
//                }
//            }
//        }

//        TODO: 별찍기 1) * : for문
//           * : 하나만 사용해서 반복문으로 출력하기
//          결과 : 1열 (안쪽 for문)
//                ****  (1행) : for문 (바깥 for문)
//                ****
//                ****
//                ****
//        for (int i = 0; i < 4; i++) {
//            가로로 * 4개 찍히는 반복문을 4번 반복하는 반복문
//            for (int j = 0; j < 4; j++) {
//                가로로 * 4개 찍히는 반복문
//                System.out.print("*"); // 4개 찍는 실행문
//            }
//            System.out.println(); // 4번 반복하는 실행문
//        }

//      TODO: 예제 2) while 문
//           1 ~ 100까지 누적합 구하기

//        int sum = 0; // 누적합을 저장할 변수
//        for (int i = 0; i < 100; i++) {
//            sum = sum + i; // 누적합
//        }
//        System.out.println(sum);

//        => while 문 변경
//        int sum = 0;        // 누적합을 저장할 변수
//        int i = 1;          // 초기값
//        while (i <= 100) {  // 조건식(참이면 반복)
//            sum = sum + i;  // 누적합
//            i++;             // 증감식
//        }
//        System.out.println(sum); // 출력은 while 문 밖에서

//        => do ~ while 문 : 특징) 최초 1번 실행(참/거짓 상관없이)
//        int sum = 0;        // 누적합을 저장할 변수
//        int i = 1;          // 초기값
//        do {  // 조건식(참이면 반복)
//            sum = sum + i;  // 누적합
//            i++;             // 증감식
//        } while (i <= 100);  // 원래 while 위치에 do 쓰고 조건문 바깥에 while문 배치
//        첫 조건식을 무조건 실행하고 뒤에 while을 통해 조건을 판단한다.
//        System.out.println(sum); // 출력은 while 문 밖에서

//        TODO: 예제 3) break : 반복문 강제 종료 예약어
//            무한반복문(무한루프) : 무한히 반복되는 반복문
//            1) for(;true;){}
//            2) while(true){}

//        while (true){
//            1 ~ 6 까지 랜덤 숫자 구하기
//            int num = (int)(Math.random()*6) + 1;
//            System.out.println(num); // 랜덤 숫자
//            if (num == 6){
//                break;  // 강제 반복문 중단
//            }

//        TODO: continue : 반복문과 더불어 사용, 이 예약어를 만나면
//                         아래 라인이 실행되지 않고 재반복
//               예제 : 1 ~ 10 까지 중 3은 출력하지 않고 모두 출력하기
//               결과 : 1 2 4 5 6 7 8 9 10
        for (int i = 1; i <= 10; i++) {
            if (i == 3){
                continue;   // 아래 실행하지 않고 재반복
            }
            System.out.print(i+ " ");   // 출력
        }


    }
}