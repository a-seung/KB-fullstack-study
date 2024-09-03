package org.example.board.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.example.board.domain.Board;
import org.example.board.service.BoardService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@Log4j
@RequestMapping("/rest/board")
@CrossOrigin("*")
@RequiredArgsConstructor
public class RestBoardController {
    // @RequiredArgsConstructor 에 의해 의존성이 자동으로 주입 됩니다
    private final BoardService boardService;
    private final String context = "/board";

    // 문제 1. 게시판 목록 기능 구현하기
    @GetMapping("/list")
    public ResponseEntity<List<Board>> listPage() {
        // 여기 부분에 코드를 완성하여, 게시판 목록 기능을 완성시켜 주세요
        List<Board> list = boardService.getList();
        return ResponseEntity.ok(list);
    }

    // 게시글 작성 모드 페이지로 이동하는 메서드 -> 이미 완성 된 상태
    @GetMapping("/create")
    public String createPage(HttpServletRequest request) {
        log.info("==========> 게시글 작성 페이지 호출, " + request.getRequestURI());

        return context + "/create";
    }

    // 문제 2. 게시글 작성 기능 구현하기
    @PostMapping("/create")
    public String create(
            @ModelAttribute Board board
            // 하나하나 파라미터 쓸 필요없음
//            @RequestParam("author") String author,
//            @RequestParam("title") String title,
//            @RequestParam("content") String content
    ) {
        // 여기 부분에 코드를 완성하여, 게시글 작성 기능을 완성시켜 주세요
//        Board board = new Board();
//        board.setTitle(title);
//        board.setContent(content);
//        board.setAuthor(author);

        boardService.create(board);
        log.info("게시글 추가 성공");

        return "redirect:/board/list";
    }

    // 문제 3. 게시글 내용 보기 기능 구현하기
    @GetMapping("/detail/{id}")
    public ResponseEntity<Board> detailPage(@PathVariable("id") Long id) {
        // 여기 부분에 코드를 완성하여, 게시글 내용 보기 기능을 완성시켜 주세요
        Board findBoard = boardService.detail(id);

        return ResponseEntity.ok(findBoard);
    }

    // 문제 4. 게시글 삭제 기능 구현하기
    @PostMapping("/delete/{id}")
    public String delete(
            @PathVariable Long id,
            HttpServletRequest request,
            Model model
    ) {
        // 여기 부분에 코드를 완성하여, 게시글 삭제 기능을 완성시켜 주세요
        log.info("==========> " + id + "번 게시글 삭제 완료, " + request.getRequestURI());

        Board board = boardService.delete(id);
        model.addAttribute("board", board);

        return "redirect:/board/list";
    }

    // 문제 5-1. 게시글 수정 기능 구현하기(기존 글 불러오기)
    @GetMapping("/update")
    public String updatePage(
            @RequestParam("id") Long id,
            HttpServletRequest request,
            Model model
    ) {
        // 여기 부분에 코드를 완성하여, 게시글 수정 페이지 이동 기능을 완성시켜 주세요
        log.info("==========> " + id + "번 게시글 수정 페이지 호출, " + request.getRequestURI());

        model.addAttribute("board", boardService.detail(id));

        return context + "/update";
    }

    // 문제 5-2. 게시글 수정 기능 구현하기
    @PostMapping("/update")
    public String update(
            @ModelAttribute Board board,
            HttpServletRequest request
    ) {
        // 여기 부분에 코드를 완성하여, 게시글 수정 기능을 완성시켜 주세요
        log.info("==========> 게시글 수정 완료, " + request.getRequestURI());

        boardService.update(board);
        return "redirect:/board/list";
    }
}
