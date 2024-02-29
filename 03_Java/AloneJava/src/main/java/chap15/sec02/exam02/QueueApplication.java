package chap15.sec02.exam02;

import java.util.LinkedList;
import java.util.Queue;

/**
 * packageName : chap15.sec02.exam02
 * fileName : QueueApplication
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
public class QueueApplication {
    public static void main(String[] args) {
//        TODO: 큐 클래스(객체) 생성 : Queue<자료형> 변수 = new LinkedList<>();
//          큐 : 인터페이스 (vs 스택 : 클래스)
//           => 자식클래스 : LinkerList<>(); 활용
        Queue<Message> queue = new LinkedList<>();

//        TODO: .offer(값) : 큐에 자료(객체를 생성해서) 넣기
        queue.offer(new Message("sendMail", "홍길동"));
        queue.offer(new Message("sendSMS", "장길산"));
        queue.offer(new Message("sendKakao", "홍두깨"));

//        TODO: queue 출력 : 모든 값 출력
        System.out.println(queue);

//        TODO: .poll() : 큐에서 자료 꺼내기
        Message message = queue.poll();
        System.out.println(message); // 1(홍길동)
        Message message2 = queue.poll();
        System.out.println(message2); // 2(장길산)

//        TODO: .peek() : 현재 큐의 맨 앞에 있는 값 조회하기
        System.out.println(queue.peek()); // 3(홍두깨)
    }
}
