package chap15.sec03.exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * packageName : chap15.sec03.exam01
 * fileName : ArraysApplication
 * author : GGG
 * date : 2024-02-14
 * description : TODO: Arrays 클래스
 * 요약 :
 * TODO:
 *      1) Arrays 클래스 : 유용한 함수들이 다수 있음
 *         예) 정렬(오름/내림차순), 특정 값 채우기
 *      2) 대상 : 배열만 다룸
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-14         GGG          최초 생성
 */
public class ArraysApplication {
    public static void main(String[] args) {
//     TODO:
        int[] arr = {0,1,2,3,4}; // 배열(1개 짜리 : 1차원 배열)
        int [][] arr2 = {{10,11,12},{20,21,22}}; // 배열(2개 짜리 : 2차원 배열)

//     TODO: 1) 1차원 배열 값 출력
//       사용법 : Arrays.toString(배열)
        System.out.println(Arrays.toString(arr)); // 전체 출력 [0, 1, 2, 3, 4]
        System.out.println(arr);                  // 출력 X

//     TODO: 2) 2차원 배열 값 출력
//       사용법 : Arrays.deepToString(배열)
        System.out.println(Arrays.deepToString(arr2)); // [[10, 11, 12], [20, 21, 22]]

//     TODO: 3) 특정 값으로 배열 채우기
//       사용법 :
        int[] arr3 = new int[5]; // 기본 : 0 으로 채워짐
        Arrays.fill(arr3, 9); // [] 9를 넣고 위에 횟수 만큼 5회 반복
        System.out.println(Arrays.toString(arr3)); // [9, 9, 9, 9, 9]

//     TODO: 4) 내림차순/오름차순 정렬 (퀵 정렬)
//        정렬 문제 : 실버급 문제들
//        참고) 정렬 알고리즘 : 속도 = 이진정렬==삽입정렬<힙정렬==퀵정렬 ...
//             퀵 정렬 단점 : 값이 미리 정렬되어 있으면 굉장히 느림 // 예) {1,2,3,4}
//        사용법 :
//        1) 내림차순
//        => char -> Character (객체자료형 변환)
        Character[] chArr = {'A','D','C','B'};
        Arrays.sort(chArr, Collections.reverseOrder()); // (배열, 옵션)
        System.out.println(Arrays.toString(chArr)); // [D,C,B,A]

//     TODO:
//      2) 오름차순 :
        Arrays.sort(chArr); // 옵션 안넣고 기본으로 두면 됨
        System.out.println(Arrays.toString(chArr)); // [A,B,C,D]

//     TODO: 5) 이진탐색(찾기)
//       탐색 : 배열에서 특정 값 찾기
//       1) 조건 : 먼저 오름차순 정렬
//       2) 탐색 시작
//        탐색 : 배열에서 특정 값 찾기
//        사용법 : Arrays.binarySearch(배열, 값) => 값의 인텍스번호가 리턴됨
        Character[] chArr2 = {'A','D','C','B'};
        Arrays.sort(chArr2); // 1) 오름차순 정렬
        int pos = Arrays.binarySearch(chArr2, 'B'); // 'B' 의 위치(인덱스번호) 찾기
        System.out.println(pos); // 1번

//      TODO: 6) (참고) 배열 -> List(ArrayList) 변경
//        사용법 : List<Integer> 변수 = new ArrayList<>(Arrays.asList(배열));
        Integer[] iArr = {1,2,3,4,5};

        List<Integer> list = new ArrayList<>(Arrays.asList(iArr));
        System.out.println(list);
    }
}
