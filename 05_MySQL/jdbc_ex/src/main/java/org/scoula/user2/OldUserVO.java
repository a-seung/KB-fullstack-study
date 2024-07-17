package org.scoula.user2;

import java.sql.Timestamp;
import java.util.Objects;

public class OldUserVO {
    private final int id;
    private final String userid;
    private final String name;
    private final String password;
    private final int age;
    private final boolean membership;
    private final Timestamp signupDate;

    //생성자 생성
    public OldUserVO(int id, String userid, String name, String password, int age, boolean membership, Timestamp signupDate) {
        this.id = id;
        this.userid = userid;
        this.name = name;
        this.password = password;
        this.age = age;
        this.membership = membership;
        this.signupDate = signupDate;
    }

    public int getId() {
        return id;
    }

    public String getUserid() {
        return userid;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public boolean isMembership() {
        return membership;
    }

    public Timestamp getSignupDate() {
        return signupDate;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        OldUserVO oldUserVO = (OldUserVO) object;
        return id == oldUserVO.id && age == oldUserVO.age && membership == oldUserVO.membership && Objects.equals(userid, oldUserVO.userid) && Objects.equals(name, oldUserVO.name) && Objects.equals(password, oldUserVO.password) && Objects.equals(signupDate, oldUserVO.signupDate);
    }

}
