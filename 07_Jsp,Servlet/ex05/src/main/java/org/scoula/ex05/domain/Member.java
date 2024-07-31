package org.scoula.ex05.domain;

public class Member {
//    VO는 나중에 데이터베이스의 테이블하고 일치시키는 객체
//    Dao에서 사용함
//
//    DTO객체는 비지니스로직을 수행하기 위해 운영하는 객체임 / 테이블과 상관 없음
//    DTO는 컨트롤러, 서비스에서 사용

    private String name;
    private String userid;

    public Member() {
    }

    public Member(String name, String userid) {
        this.name = name;
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
