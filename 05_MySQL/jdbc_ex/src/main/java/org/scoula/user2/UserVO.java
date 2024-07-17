package org.scoula.user2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;

@Data //getter setter hash equals
@AllArgsConstructor // 생성자 생성
public class UserVO {
    private final int id;
    private final String userid;
    private final String name;
    private final String password;
    private final int age;
    private final boolean membership;
    private final Timestamp signupDate;

    // VO
    // 값이 변하지 않아야해서 final 사용
    // 비교를 위한 객체


}
