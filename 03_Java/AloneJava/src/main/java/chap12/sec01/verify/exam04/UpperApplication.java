package chap12.sec01.verify.exam04;

import java.util.Scanner;

/**
 * packageName : chap12.sec01.verify.exam04
 * fileName : UpperApplication
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
public class UpperApplication {
    public static void main(String[] args) {
//        대소문자 바꾸기 : 문자열.LowerCase(), UpperCase()
//        입력 : WrongAnswer
//        출력 : wRONGaNSWER
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        for (int i = 0; i < str.length(); i++) {
            String temp = String.valueOf(str.charAt(i));
            if (temp.equals(temp.toLowerCase()) == true) {
                System.out.print(temp.toUpperCase()); // 대문자 바꾸기
            } else{
                System.out.print(temp.toLowerCase()); // 소문자 바꾸기
            }
        }

    }
}
