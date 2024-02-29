package chap18.sec01.exam11;

import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

/**
 * packageName : chap18.sec01.exam11
 * fileName : ReadApplication
 * author : GGG
 * date : 2024-02-19
 * description : TODO: 한 문자씩 읽기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-19         GGG          최초 생성
 */
public class ReadApplication {
    public static void main(String[] args) throws Exception{
//      1) 파일 읽기로 열기
//      2) 반복문 : 파일 끝까지(-1)
//      3) 파일 읽기
//      3) 파일 닫기
        Reader reader = new FileReader("src/main/resources/test7.txt");

        while (true) {
            int data = reader.read(); // 1문자씩 읽기 (정수 : 아스키코드)
            if (data == -1) break; // 반복문 종료(파일 끝 : -1)
            System.out.println((char) data); // 화면 출력, 아스키코드 -> 문자 변경
        }
        reader.close(); // 파일 닫기
    }
}
