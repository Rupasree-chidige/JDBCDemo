package com.stackroute.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTransactionDemo {
    public  void ExecuteJdbcTransactionDemo()
    {
        Connection connection=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo", "root", "Root@123");
            connection.setAutoCommit(false);

            Statement stmt=connection.createStatement();
            stmt.addBatch("insert into Employee values(7,'Pavan',28,'M')");
            stmt.addBatch("insert into Employee values(3,'Preethi',17,'F')");

            int[] i=stmt.executeBatch();//executing the batch
            System.out.println("Executed "+i.length+" Queries");

            connection.commit();



        } catch (
                SQLException e) {

            try {
                connection.rollback();
                System.out.println("Primary Key Voilation "+e.getMessage());
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }


        } catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
