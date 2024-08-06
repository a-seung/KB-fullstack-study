package org.example.dto.member;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MemberDtoListV2 {
    private List<MemberDto> memberDtoList;

    private MemberDtoListV2() {
        this.memberDtoList = new ArrayList<>();
        this.addList("salee981119","이승아");
        this.addList("tetz","이효석");
    }

    public void addList(String id, String name) {
        memberDtoList.add(new MemberDto(id, name));
    }

    public List<MemberDto> getList() {
        return memberDtoList;
    }
}

