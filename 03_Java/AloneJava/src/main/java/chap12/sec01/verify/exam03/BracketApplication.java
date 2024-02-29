package chap12.sec01.verify.exam03;

import java.util.Scanner;

/**
 * packageName : chap12.sec01.verify
 * fileName : BracketApplication
 * author : GGG
 * date : 2024-02-15
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-15         GGG          최초 생성
 */
public class BracketApplication {
    public static void main(String[] args) {
// TODO: 연습문제) 1410 : 올바른 괄호 1 (괄호 개수 세기)
//    프로그래밍을 할 때 가장 중요한 것 중 하나가 괄호의 개수를 맞추는 것이다.
//    즉, 여는 괄호가 있으면 항상 닫는 괄호가 있고, 닫는 괄호가 있으면 여는 괄호도 있어야 한다.
//    올바른 괄호를 확인하기 위해 가장 기본적인 방법 중 하나는 여는 괄호와 닫는 괄호의 개수를 세는 것이다.
//    소괄호로 이루어진 문자열을 주어지면 괄호의 개수를 출력하는 프로그램을 작성하시오.
//    힌트 : charAt()
//    입력 :
//         ((())()(()))
//    출력 :
//         6 6

//      알고리즘 : 1) 1문자씩 가져와서 그 문자가 ( 이면 count = count + 1
//                  if(str.charAt(0) == '(') { 개수세기 }
//               2) 1문자씩 가져와서 그 문자가 ) 이면 count2 = count2 + 1
//                  else-if(str.charAt(0) == ')') { 개수세기 }
//               3) 1 ~ 2번 반복문 실행 : 문자열의 끝까지 (length())
//               4) 출력 : count count2

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        int count = 0;
        int count2 = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(') {
                count = count + 1;
            } else if (str.charAt(i) == ')') {
                count2 = count2 + 1;
            }
        }
        System.out.println(count + " " + count2);
    }
}
