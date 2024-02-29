package chap11.sec02.verify.exam01;

/**
 * packageName : chap11.sec02.verify.exam01
 * fileName : NullApplication
 * author : GGG
 * date : 2024-02-14
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-14         GGG          최초 생성
 */
public class NullApplication {
    public static void main(String[] args) {
// TODO: 연습문제) 아래 예러(에외)를 발생시키는 프로그램이 있다.
//       try ~ catch 구문을 사용해서 개선하세요.
//      결과 :
//         프로그램에 오류가 발생했습니다.
//        String data = "";                  // 아무것도 없는 값
//        String data = "";                  // 초기화
//        문자열.toString()
//      TODO: 변수 값이 null 이면 속성(필드), 함수를 실행할 수 없음
//        System.out.println(data.toString()); // 에러(예외) 발생

        try {
            String data = null;
            System.out.println(data.toString());
        } catch (Exception e){
            System.out.println("프로그램에 오류가 발생했습니다.");
        }
    }
}
