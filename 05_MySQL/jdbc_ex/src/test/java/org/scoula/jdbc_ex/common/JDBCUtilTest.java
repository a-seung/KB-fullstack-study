package org.scoula.jdbc_ex.common;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class JDBCUtilTest {

    @Test
    @DisplayName("jdbc_ex에 접속한다.(자동 닫기)")
    public void testConnection2() throws SQLException {
        try (Connection conn = JDBCUtil.getConnection()) {
            //패키지가 동일해서 JDBCUtil은 임포트 필요 없음
            System.out.println("DB 연결 성공");
        }
    }
}