package chap18.sec03.exam01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * packageName : chap18.sec03.exam01
 * fileName : GetLineApplication
 * author : GGG
 * date : 2024-02-19
 * description : TODO: 키보드 입력 + 성능 향상
 * 요약 :
 * TODO: 1) System.in  : 키보드 입력
 *          예) new Scanner(System.in);
 *       2) System.out : 모니터 출력
 *          예) System.out.println();
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-19         GGG          최초 생성
 */
public class GetLineApplication {
    public static void main(String[] args) throws Exception{
//      System.in(키보드 입력)
//      1) 문자 기반 보조스트림 (기능추가 1)
        Reader reader = new InputStreamReader(System.in);
//      2) 성능 향상 보조스트림 (기능추가 2)
        BufferedReader bufferedReader = new BufferedReader(reader);

//      문제 : q 가 입력될 때까지 입력된 값을 화면에 출력하기
        while (true) {
            String str = bufferedReader.readLine(); //1줄 입력
            if (str.equals("q") == true) break;
            System.out.println(str);
        }
        bufferedReader.close(); // 닫기
    }
}
