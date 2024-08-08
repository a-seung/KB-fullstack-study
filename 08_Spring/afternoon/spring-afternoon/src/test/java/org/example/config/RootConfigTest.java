package org.example.config;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.*;

@Configuration
@SpringJUnitConfig
@ContextConfiguration(classes = RootConfig.class)
@PropertySource("classpath:application.properties")
@Slf4j
class RootConfigTest {
    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    void sqlSessionFactory() {
        try (SqlSession session = sqlSessionFactory.openSession();
             Connection conn = session.getConnection()) {

            log.info("SQLSession: {}", session);
            log.info("Connection: {}", conn);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}