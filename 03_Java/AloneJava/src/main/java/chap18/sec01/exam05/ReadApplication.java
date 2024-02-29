package chap18.sec01.exam05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * packageName : chap18.sec01.exam05
 * fileName : ReadApplication
 * author : GGG
 * date : 2024-02-19
 * description : TODO: 임시 버퍼를 만들어 읽기 : 속도 향상
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-19         GGG          최초 생성
 */
public class ReadApplication {
    public static void main(String[] args) throws Exception{
        InputStream inputStream = new FileInputStream("src/main/resources/test2.db");

//      버퍼 : 배열 생성 : 속도 향상
        byte[] buffer = new byte[100];

//      읽기 : 1) 반복문 : 파일 끝까지 읽기(-1)
        while (true) {
            int data = inputStream.read(buffer); // 배열 크기 만큼 최대한 읽기
//          반복문 종료 : 파일 끝
            if (data == -1) break;
//          읽은 값은 buffer 배열에 있음 => 화면 출력
//          data : 읽은 byte 수
//          buffer : 성능 향상 배열

            for (int i = 0; i < data; i++) {
                System.out.println(buffer[i]);
            }
        }
        inputStream.close(); // 파일 닫기 (사용 끝)
    }
}
