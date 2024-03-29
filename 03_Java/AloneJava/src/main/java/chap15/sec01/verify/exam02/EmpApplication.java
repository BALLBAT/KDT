package chap15.sec01.verify.exam02;

import java.util.List;

/**
 * packageName : chap15.sec01.verify.exam02
 * fileName : EmpApplication
 * author : GGG
 * date : 2024-02-13
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-13         GGG          최초 생성
 */
public class EmpApplication {
    public static void main(String[] args) {
// TODO: 연습문제) 실행 클래스의 결과가 다음과 같도록
//       Emp 모델을 디자인하고 EmpDao의 createEmp()
//       List 의 자료를 추가하는 로직을 작성하세요.
//    결과 :
//        1 Scott 3000 500 10
//        2 Mark 3500 0 20
//        3 Smith 5000 1000 30
        EmpDao empDao = new EmpDao();

        List<Emp> empList =  empDao.createEmp();

        //        List 배열 내용 출력
        for(Emp emp : empList) {
            System.out.println(emp.getEno() + " "
                    + emp.getEname() + " "
                    + emp.getSalary() + " "
                    + emp.getComission() + " "
                    + emp.getDno());
        }
    }
}
