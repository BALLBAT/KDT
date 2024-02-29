package chap11.sec01.exam01;

/**
 * packageName : chap11.sec01.exam01
 * fileName : NullApplication
 * author : GGG
 * date : 2024-02-14
 * description : TODO: Null 포인터 에러(예외)
 * 요약 :
 * TODO: 1) .NullPointerException : 변수에 null 넣고 속성/함수를 실행했을 때
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-14         GGG          최초 생성
 */
public class NullApplication {
    public static void main(String[] args) {
        String data = null; // 아무것도 없는 값
//      String data = "";   // 초기화 권장값
//      문자열.toString()
//     TODO: 변수 값이 null 이면 속성(필드), 함수를 실행할 수 없음
        System.out.println(data.toString()); // 에러 발생
    }
}
