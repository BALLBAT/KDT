package chap15.sec03.exam02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * packageName : chap15.sec03.exam02
 * fileName : CollectionsApplication
 * author : GGG
 * date : 2024-02-14
 * description : TODO: Collections(자료구조 : List, Set, Map)에 유용한 함수들 소개
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-14         GGG          최초 생성
 */
public class CollectionsApplication {
    public static void main(String[] args) {
//     TODO:
        List<Integer> list = new ArrayList<>();

//     TODO: 1) list 에 값 넣기
//      사용법 : Collections.addAll(향상된 배열, 값,값1,값2,...);
        Collections.addAll(list, 1,2,3,4,5);
        System.out.println(list); // [1, 2, 3, 4, 5]

//     TODO: 2) list 값들을 오른쪽으로 회전시키기
//      사용법 : Collections.rotate(향상된 배열, 오른쪽칸이동)
        Collections.rotate(list, 2);
        System.out.println(list); // [4, 5, 1, 2, 3] 오른쪽으로 한칸씩 밀림

//     TODO: 3) list 에 특정 값을 서로 교환하기
//      사용법 : Collections.swap(향상된 배열, 시작인덱스, 끝인덱스)
//        => 시작인덱스값 <-> 끝인덱스값을 서로 교환
        Collections.swap(list, 0, 1);
        System.out.println(list); // [5,4,1,2,3]

//     TODO: 4) list 를 정렬(오름/내림)
//      팀 정렬 : 삽입정렬 + 합병정렬 (속도 : 퀵정렬과 같음)
//      사용법 : Collections.sort(향상된배열, Collections.reverseOrder());
//        4-1) 내림차순 정렬
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list); // [5,4,3,2,1]
//     TODO: 4-2) 오름차순 정렬
//      사용법 : Collections.sort(향상된배열)
        Collections.sort(list);
        System.out.println(list); // [1,2,3,4,5]

//     TODO: 5) list 의 이진탐색 하기
//      1) 조건 : 오름차순 정렬
//      2) 탐색 시작
//      사용법 : 변수 = Collections.binarySearch(향상된 배열, 찾을 값)
//        변수 : 찾은 인덱스번호가 리턴됨
        int index = Collections.binarySearch(list, 3);
        System.out.println(index); // 2

//     TODO: 6) list 에서 max/min 찾기
//           6-1) max(최대값) :
        System.out.println(Collections.max(list)); // 5
//     TODO: 6-2) min(최소값) :
        System.out.println(Collections.min(list)); // 1
    }
}
