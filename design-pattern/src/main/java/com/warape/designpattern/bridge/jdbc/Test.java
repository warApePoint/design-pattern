package com.warape.designpattern.bridge.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //加载及注册JDBC驱动程序
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/sample_db?......";

        Connection con = DriverManager.getConnection(url);
        Statement stmt = con.createStatement();

        // 省略...
    }
}
