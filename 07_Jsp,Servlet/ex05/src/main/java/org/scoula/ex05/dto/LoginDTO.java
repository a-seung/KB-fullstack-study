package org.scoula.ex05.dto;

public class LoginDTO {
    private String name;
    private String password;

    //전체 생성자
    public LoginDTO() {
    }

    // 기본 생성자
    public LoginDTO(String name, String password) {
        this.name = name;
        this.password = password;
    }

    // getter, setter
    public String getName() {
        return name;
    }
    //getName 주석처리하면 500번 에러가 남

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
