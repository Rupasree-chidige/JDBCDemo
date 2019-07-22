package com.stackroute.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class DatabaseMetadataDemo {

    public void ShowDatabaseMetaData()
    {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
      try(
        Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Demo","root","Root@123");
           ){
          DatabaseMetaData dbmd=con.getMetaData();
            System.out.println("Driver Name: "+dbmd.getDriverName());
            System.out.println("Driver Version: "+dbmd.getDriverVersion());
            System.out.println("UserName: "+dbmd.getUserName());
            System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());
            System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());


        }catch(Exception e){ System.out.println(e);}
    }

}

