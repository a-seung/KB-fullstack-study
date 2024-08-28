package org.scoula.member.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.scoula.security.account.domain.MemberVO;
import org.springframework.web.multipart.MultipartFile;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberUpdateDTO
{
    private String username;
    private String password;
    private String email; // update쿼리로 바뀌는 것은 실질적으로 이메일이랑 업데이트 시간밖에 없음

    MultipartFile avatar; // json인코딩이 아니라 멀티파트 인코딩 해줘야함

    public MemberVO toVO() {
        return MemberVO.builder()
                .username(username)
                .email(email)
                .build();
    }
}