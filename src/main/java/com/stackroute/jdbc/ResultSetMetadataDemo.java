package com.stackroute.jdbc;

import java.sql.*;

public class ResultSetMetadataDemo {
    public void ShowResultsetMetaData()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo", "root", "Root@123");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("Select * from Employee");)
        {

            ResultSetMetaData rsmd = resultSet.getMetaData();
            for (int i = 1; i <=rsmd.getColumnCount() ; i++) {
                System.out.print("Column "+i+":"+rsmd.getColumnName(i));
                System.out.println("  "+rsmd.getColumnTypeName(i));
             }





        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
