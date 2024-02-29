package chap15.sec02.exam02;

/**
 * packageName : chap15.sec02.exam02
 * fileName : Message
 * author : GGG
 * date : 2024-02-14
 * description : TODO: Queue(큐) 자료구조 예제
 * 요약 :
 * TODO:
 *      1) 맨 처음에 들어간 자료가 맨 처음 나옴(선입선출)
 *         FIFO(First In First Out)
 *      2) 주요 함수 :
 *          - 넣기 : offer()
 *                  큐에서 값을 넣기
 *          - 빼기 : .poll()
 *                  큐에서 값을 삭제 시킴, 삭제한 값 확인 가능
 *          - 맨 앞 조회 : .peek()
 *                       큐에 맨 앞에 있는 값을 조회, 큐에서 삭제 안함
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-14         GGG          최초 생성
 */
public class Message {
    public String command; // 명령어
    public String to; // 대상(사람)

//    생성자 2개
//    함수의 매개변수(==인자)

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }

//    toString() 재정의

    @Override
    public String toString() {
        return "Message{" +
                "command='" + command + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
