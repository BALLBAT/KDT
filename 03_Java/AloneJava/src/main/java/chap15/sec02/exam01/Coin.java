package chap15.sec02.exam01;

/**
 * packageName : chap15.sec02.exam01
 * fileName : Coin
 * author : GGG
 * date : 2024-02-13
 * description : TODO: 모델 클래스, Stack(스택) 예제
 * 요약 :
 * TODO: 1) 스택 특징 : 맨 끝에 들어온 데이터가 맨 처음으로 나감(후입선출)
 *            => LIFO(Last In First Out)
 *            예) 문자열 거꾸로 출력하기 등의 코딩에서 활용
 *            => 백준 실버 5 ~ 2 까지, 브1?
 *       2) 스택 자료구조 함수 :
 *            - 넣기 : .push(값)
 *                 스택에 자료를 넣기
 *            - 빼기 : .pop()
 *                 스택의 맨 위에 있는 자료를 꺼내기. 기존 스택에서 자료 제거됨
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-13         GGG          최초 생성
 */
public class Coin {
    private int value; // 동전 값
//    생성자 : 1개
    public Coin(int value) {
        this.value = value;
    }
//    setter/getter 함수
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

//    TODO: toString() 재정의 : 객체 -> 문자열로 변환
    @Override
    public String toString() {
        return "Coin{" +
                "value=" + value +
                '}';
    }
}
