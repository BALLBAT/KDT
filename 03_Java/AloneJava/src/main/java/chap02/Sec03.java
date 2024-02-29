package chap02;

/**
 * packageName : chap02
 * fileName : Sec03
 * author : GGG
 * date : 2024-01-24
 * description : 자료형 변환
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-24         GGG          최초 생성
 */
public class Sec03 {
    public static void main(String[] args) {
//        main
//        TODO: 1) 자동 (자료)형 변환
//          => 작은 자료형 -> 큰 자료형 = 큰 자료형 : 자동 자료형 변환
//        byte bValue = 10;    // 1byte
//        int iValue = bValue; // 4byte
//        System.out.println(iValue);

//        int iValue = 50;      // 4byte
//        long lValue = iValue; // 8byte
//        System.out.println(lValue);
//
//        float fValue = 100.5f;  // 4byte
//        double dVlaue = fValue; // 8byte
//        System.out.println(dVlaue);

//        char : 정수/문자 자료형 : 코딩테스트 문제
//        TODO: char <-> int 이용해서 문자/아스키코드 변환을 함
        char cValue = 'A';   // 1byte
        int iValue = cValue; // 4byte
        System.out.println(iValue); // 정수 아스키코드가 출력됨

//        TODO: 2) 수동 (자료)형 변환 : 큰자료형 -> 작은자료형
//          => 사용법 : 소자료형 변수 = (소자료형)큰자료형; // (소자료형) : 캐스팅 연산자
//              2-1) 정수 :
//        int iValue = 65;            // 4byte
//        char cValue = (char)iValue; // 1byte
//
////        char 변수명 = 65; => 아스키코드 (자동 문자변환) ==> A
//        System.out.println(cValue); // A

//        TODO: 정리) 아스키코드 <-> 문자 변환
//        char cValue = 'A';
//        int iValue = cValue; // 65 (아스키코드)
//        System.out.println(iValue);

//        char cVlaue2 = (char)iValue; // A
//        System.out.println(cVlaue2); // A

//        TODO: 2-2) 정수 2 : int(4byte) <-> long(8byte)
//        long lValue = 500;        // 8byte
//        int iValue = (int)lValue; // 4byte

//        TODO: 2-3) 정수/실수 : int(4byte) <-> double(8byte)
//        double dValue = 3.14;       // 8byte
//        int iValue = (int) dValue;  // 4byte
//        System.out.println(iValue); // 3 (소수점 사라짐)

//        TODO: 예제) x = 1, y = 2 나눗셈 결과를 코딩하세요.
//              단, 만약 소수점이 있으면 소수점까지 출력하세요.
//        int x = 1;
//        int y = 2;
//        double result = (double)x / (double)y; // 미리 실수형으로 바꾸기
//        System.out.println(result); // 0.5

//        TODO: (참고) 산술연산/모든연산 우선순위 : ()
//        int value = (10+2) * 8;
//        System.out.println(value);
//
//        String str = "10" + (2 + 8); // 괄호 적용 1010
//        String str2 = "10" + 2 + 8;  // 괄호 없음 1028
//        System.out.println(str);     // "10" + 10 => "10" + "10" ==> 1010
//        System.out.println(str2);    // "10" + "2" + "8" ==> "102" + "8" ==> "1028"

//        TODO: 3) 문자열 -> 숫자(정수, 실수 등) 변환 함수 소개
//          예제 : "10" -> 10 변경
//          사용법 : int 변수 = Integer.parseInt("문자열");
//        int val1 = Integer.parseInt("10");
//        System.out.println(val1);

//        TODO: 예제 : "3.14" -> 3.14 변경
//           사용법 : double 변수 = Double.parseDouble("문자열");
//        double val2 = Double.parseDouble("3.14"); // 3.14
//        System.out.println(val2);

//        TODO: 예제 : "true" -> true 변경
//        boolean val3 = Boolean.parseBoolean("true");
//        System.out.println(val3); // true

//        TODO: 숫자(정수, 실수 등) -> 문자열 변경 함수
//        TODO: 예제 : 10 -> "10", 3.14 -> "3.14", true -> "true"
//        String str1 = String.valueOf(10); // "10"
//        String str2 = String.valueOf(3.14); // "3.14"
//        String str3 = String.valueOf(true); // "true"
//
//        System.out.println(str1);
//        System.out.println(str2);
//        System.out.println(str3);
    }
}