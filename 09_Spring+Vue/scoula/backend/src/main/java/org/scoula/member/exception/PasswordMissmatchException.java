package org.scoula.member.exception;


// 패스워드가 일치하지 않을 때 수정이 안되므로 사용자정의 예외를 만들어줌
public class PasswordMissmatchException extends RuntimeException{
    public PasswordMissmatchException() {
        super("비밀번호가 일치하지 않습니다.");
    }
}