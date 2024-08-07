package org.example.controller.member;

import lombok.extern.slf4j.Slf4j;
import org.example.dto.member.MemberDtoListV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
@RequestMapping("/member/v3")
public class MemberControllerV3 {
    private MemberDtoListV2 memberList;

    @Autowired
    public MemberControllerV3(MemberDtoListV2 memberDtoList) {
        this.memberList = memberDtoList;
    }

    @GetMapping("/show") // 실제주소: member/v3/show
    public String memberList(Model model) {
        log.info("=====================> 회원 목록 조회 페이지 호출, /member/v3/show");

        model.addAttribute("memberList", memberList.getList());
        return "member-show3";
    }

    @GetMapping("/form")
    public String memberForm() {
        log.info("=========> 회원 추가 페이지 호출, member/v3/form");

        return "member-form3";
    }

    @PostMapping ("/form/save") // 입력한 정보가 모두 쿼리스트링에 뜨기 때문에 Post로 함
    public String memberSave(
            @RequestParam("id") String id,
            @RequestParam("name") String name,
            Model model) {
        // 파라미터 받을 때 request 쓰기 때문에 여기선 지우면 안된다
        log.info("===========> 회원 추가 Request 호출, /member/v3/form/save");

        memberList.addList(id, name);
        model.addAttribute("memberList", memberList.getList());

        return "member-show3";
    }

}
