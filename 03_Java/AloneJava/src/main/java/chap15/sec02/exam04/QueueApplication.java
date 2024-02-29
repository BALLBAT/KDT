package chap15.sec02.exam04;

import java.util.LinkedList;
import java.util.Queue;

/**
 * packageName : chap15.sec02.exam04
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
//     큐 생성 :
        Queue<Integer> queue = new LinkedList<>();

//     TODO: 값 넣기 : 1 2 3 4
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

//     TODO: 값 꺼내서 출력 : 1 2 3 4
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
