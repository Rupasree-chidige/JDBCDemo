package com.stackroute.jdbc;

import java.sql.*;

public class JdbcBatchDemo {
    public void ExecuteJdbcBatchDemo() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo", "root", "Root@123");

        ) {
            connection.setAutoCommit(false);

            Statement stmt=connection.createStatement();
            stmt.addBatch("insert into Employee values(5,'Harsha',20,'M')");
            stmt.addBatch("insert into Employee values(6,'Preethi',17,'F')");

            int[] i=stmt.executeBatch();//executing the batch
            System.out.println("Executed "+i.length+" Queries");

            connection.commit();



        } catch (
                SQLException e) {
            System.out.println("Primary Key Voilation"+e.getMessage());

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
