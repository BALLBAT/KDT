package org.example.modelexam.controller.exam01;

import lombok.extern.slf4j.Slf4j;
import org.example.modelexam.model.Board;
import org.example.modelexam.model.Dept;
import org.example.modelexam.service.exam01.BoardService;
import org.example.modelexam.service.exam01.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

/**
 * packageName : org.example.modelexam.controller.exam01
 * fileName : BoardController
 * author : GGG
 * date : 2024-03-15
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-15         GGG          최초 생성
 */
@Slf4j
@Controller
@RequestMapping("/exam01")
public class BoardController {
    @Autowired
    BoardService boardService; // 객체 정의

//  전체 조회
    @GetMapping("/board")
    public String getBoardAll(Model model) {
//      TODO: Service 객체의 전체 조회 함수를 호출
        List<Board> list = boardService.findAll();
//      TODO: model 에 담아 jsp 로 전달
        model.addAttribute("list", list);

        return "exam01/board/board_all.jsp";
    }

//  기본키(게시판 번호)로 상세 조회
    @GetMapping("/board/{id}")
    public String getBoardId(@PathVariable int id,
                            Model model){
//      TODO: service 의 상세조회 함수(findById) 호출
        Board board = boardService.findById(id);
//      TODO: jsp board 객체 전송
        model.addAttribute("board", board);
        return "exam01/board/board_id.jsp";
    }

//  TODO: 게시물 추가(저장) 페이지 열기 함수 #1
    @GetMapping("/board/addition")
    public String addBoard() {
        return "exam01/board/add_board.jsp";
    }

//  TODO: 저장 버튼 클릭시 실행될 함수 #2
//    url : /board/add
//    redirect url : /exam01/board
//    sql insert(추가/저장) : post 방식 -> @PostMapping
    @PostMapping("/board/add")
    public RedirectView createBoard(@ModelAttribute Board board){
//      TODO: DB 저장 함수 실행(서비스)
        boardService.save(board);

//   TODO: 저장 후 전체 조회 페이지로 강제 이동 : /exam01/board
//      RedirectView : 이 클래스가 강제로 페이지 이동을 시켜주는 것
//      사용법 : new RedirectView("/공통url/함수url")
        return new RedirectView("/exam01/board");
    }

//  TODO: 수정 페이지 열기 함수
//    => 수정 페이지가 열릴 때
//    url : board/edition/{id}
//    jsp : exam01/board/update_board.jsp
    @GetMapping("/board/edition/{id}")
    public String editBoard(@PathVariable Integer id,
                           Model model) {
//      TODO: 1) 먼저 상세조회를 1건 함
        Board board = boardService.findById(id);
//      TODO: 2) 부서 객체를 jsp 로 전송
        model.addAttribute("board", board);

        return "exam01/board/update_board.jsp";
    }

    //  TODO: 수정 버튼 클릭시 실행될 함수
//    => 수정 후 전체 조회 페이지로 강제 이동 :
//    => 사용법 : new RedirectView("/이동할 url")
//    => 클래스 == 자료형
//    => update => put 방식 => @PutMapping("/url")
//    => sql update ~ where 게시물 번호 = ?
//    => url : /board/edit/{id}
    @PutMapping("/board/edit/{id}")
    public RedirectView updateBoard(@PathVariable Integer id,
                                   @ModelAttribute Board board){
//      TODO: 수정 함수(서비스) 호출
//       => save : if (insert) else (update) : id == null
//       => 추가든 수정이든 save 사용하면 된다.
        boardService.save(board);
//      TODO: 전체 조회 페이지로 강제 이동 : /exam01/board
        return new RedirectView("/exam01/board");
    }

    //  TODO: sql delete -> delete 방식 -> @DeleteMapping
//    => sql delete ~ where 조건식 (id=1)
//    => url : /board/delete/{id}
    @DeleteMapping("/board/delete/{id}")
    public RedirectView deleteBoard(@PathVariable Integer id) {
//        TODO: DB 삭제 함수 실행(서비스)
        boardService.removeById(id);
//        TODO: 삭제 후 전체 조회 페이지로 강제 이동
        return new RedirectView("/exam01/board");
    }
}
