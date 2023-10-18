package com.cy.store;

import com.zaxxer.hikari.pool.HikariProxyConnection;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class StoreApplicationTests {
    @Autowired   //自动装配
    private DataSource dataSource;
    @Test
    void contextLoads() {
    }
//    单元测试
//数据库链接池 1.JDBC下的DBCP 2.C3P0 4.H
//    HikariProxyConnection@1423900009 wrapping com.mysql.cj.jdbc.ConnectionImpl@31ab4859
    @Test
    void getConnection(){
        try {
            System.out.println(dataSource.getConnection());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
