import java.util.Scanner;

/**
 * packageName : PACKAGE_NAME
 * fileName : Simple003
 * author : ballbat
 * date : 2024-02-18
 * description : 10872    팩토리얼
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-18         ballbat          최초 생성
 */
public class Simple003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); // 10
        int fac = 1;                 // 1 초기화 : 1*2 ... *10

        for (int i = 1; i <= num; i++) {
            fac = fac * i;           // 누적곱
        }
        if(num == 0) {
            System.out.println(1);   // 1
        } else {
            System.out.println(fac);
        }
    }
}
