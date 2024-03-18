package org.example.modelexam.service.exam01;

import org.example.modelexam.dao.FaqDao;
import org.example.modelexam.model.Board;
import org.example.modelexam.model.Dept;
import org.example.modelexam.model.Faq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * packageName : org.example.modelexam.service.exam01
 * fileName : FaqService
 * author : BALLBAT
 * date : 2024-03-18
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-18         BALLBAT          최초 생성
 */
@Service
public class FaqService {
//  todo: 연습 1)
//    FaqService 클래스를 만들고 findAll() 함수를 정의한다.
//    FaqController 클래스를 만들어서 getFaqAll() 함수를 정의하고,
//    샘플데이터 뷰로(jsp : faq_all.jsp) 전송해 보세요.
    @Autowired
    FaqDao faqDao;

    public List<Faq> findAll(){
        List<Faq> list = faqDao.selectAll();
        return list;
    }

//  todo: 연습 2-3)
//    FaqService 클래스를 만들고 findById() 함수를 정의한다.
//    FaqController 클래스를 만들어서 getFaqId() 함수를 정의하고,
//    샘플데이터 뷰로(jsp : faq_id.jsp) 전송해 보세요.
//    url : /faq/{fno}
//    jsp : exam01/faq/faq_id.jsp
//    url test : http://localhost:8000/exam01/faq/1
@GetMapping("/faq")
public Faq findById(Integer fno) {
//      TODO: DB 상세조회(1건==객체1개) 함수 호출
//          상세조회 : 기본키로 조회하는 것을 의미
    Faq faq = faqDao.selectById(fno);

    return faq;
}

//  todo: 연습 4-3)
//    FaqService 클래스를 만들고 save() 함수를 정의한다.
//    FaqController 클래스를 만들어서 addFaq(),
//    createFaq() 함수를 정의
//    addFaq()
//    - url : /faq/addition
//    - jsp : exam01/faq/add_faq.jsp
//    createFaq()
//    - url : /faq/add
//    - redirect url : /exam01/faq
public List<Faq> save(Faq faq) {

    List<Faq> list = null;
    if (faq.getFno() == null) {
        list = faqDao.insert(faq); // 게시판 번호 자동 생성 (시퀀스)
    } else {
        list = faqDao.update(faq);
    }
    return list;
}

//  todo: 연습 5-3)
//    FaqService 클래스를 만들고 save() 함수를 정의한다.
//    FaqController 클래스를 만들어서 editFaq(), updateFaq() 함수를 정의
//    editFaq()
//    - url : /faq/edition/{fno}
//    - jsp : exam01/faq/update_faq.jsp
//    updateFaq()
//    - url : /faq/edit/{fno}
//    - redirect url : /exam01/faq


//  todo: 연습 6-3)
//    FaqService 클래스를 만들고 removeById() 함수를 정의한다.
//    FaqController 클래스를 만들어서 deleteFaq() 함수를 정의
//    update_faq.jsp 삭제버튼과 url 를 추가한다.
//    deleteFaq()
//    - url : /faq/delete/{fno}
//    - redirect url : /exam01/faq

    public boolean removeById(Integer fno) {
//      TODO: DB 삭제 함수 실행
        int count = faqDao.deleteById(fno);

        return (count > 0)? true : false;
    }
}
