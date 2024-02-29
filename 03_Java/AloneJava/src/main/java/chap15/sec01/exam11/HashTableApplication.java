package chap15.sec01.exam11;

import java.util.Hashtable;
import java.util.Map;

/**
 * packageName : chap15.sec01.exam11
 * fileName : HashTableApplication
 * author : GGG
 * date : 2024-02-13
 * description : TODO: HashTable
 * 요약 :
 * TODO: 1) Map : 부모 인터페이스
 *       2) 활용 : 멀티쓰레드 환경에서 사용
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-13         GGG          최초 생성
 */
public class HashTableApplication {
    public static void main(String[] args) {
//   TODO: Map<키자료형, 값자료형> map = new HashTable<>();
        Map<String, String> map = new Hashtable<>();
//   TODO: map.put(키, 값) : 키, 값 추가
        map.put("spring", "12");
        map.put("summer", "123");
        System.out.println(map); // {summer=123, spring=12}
    }
}
