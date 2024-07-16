package org.scoula.user;

import org.scoula.jdbc_ex.common.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ManageUserProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        //회원정보 입력
//        System.out.print("추가할 회원의 ID : ");
//        String userid = sc.nextLine();
//        System.out.print("이름 : ");
//        String name = sc.nextLine();
//        System.out.print("비밀번호 : ");
//        String password = sc.nextLine();
//        System.out.println("나이 : ");
//        int age = sc.nextInt();
//        sc.nextLine();
//        // nextInt,nextBoolean은 엔터키가 남아서 다음값에 들어가버리기 때문에 넣어줌
//        System.out.println("멤버쉽 여부 (true/false) : ");
//        boolean membership = sc.nextBoolean();
//        sc.nextLine();
//
//        User newUser = new User(userid, name, password, age, membership);
//
//        // 데이터베이스 접속
//        Connection conn = JDBCUtil.getConnection();
//
//        ManageUser manageUser = new ManageUser();
//        manageUser.addUser(newUser);

//        // 회원 삭제 기능 구현
//        System.out.println("삭제할 회원의 ID : ");
//        int deleteInt = sc.nextInt();
//
//        // 삭제 기능을 실행
//        ManagerUser manageUser = new ManageUser();
//        manageUser.deleteById(deleteId);

        // 회원 목록 출력
        ManageUser manageUser = new ManageUser();
        manageUser.getAllUsers();

    }
}
