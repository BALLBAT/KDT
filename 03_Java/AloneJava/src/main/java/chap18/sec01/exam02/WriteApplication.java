package chap18.sec01.exam02;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * packageName : chap18.sec01.exam02
 * fileName : WriteApplication
 * author : ballbat
 * date : 2024-02-18
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-18         ballbat          최초 생성
 */
public class WriteApplication {
    public static void main(String[] args) throws Exception {
//        파일 열기
        OutputStream outputStream
                = new FileOutputStream("src/main/resources/test2.db");

//        배열
        byte[] arr = {10,20,30};

//        버퍼 쓰기
        outputStream.write(arr);

//        버퍼 -> 파일에 쓰기
        outputStream.flush();
//        파일 닫기
        outputStream.close();
    }

}
