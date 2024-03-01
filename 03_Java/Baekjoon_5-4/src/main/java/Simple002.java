import java.util.Scanner;

/**
 * packageName : PACKAGE_NAME
 * fileName : Simple002
 * author : ballbat
 * date : 2024-02-18
 * description : 2741    N 찍기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-18         ballbat          최초 생성
 */
public class Simple002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();     // 5

        for (int i = 0; i < num; i++) {
            System.out.println(i + 1);
        }
    }

}
