package com.stackroute.jdbc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SimpleJdbcDemo simpleJdbcDemo = new SimpleJdbcDemo();
        simpleJdbcDemo.getEmployeeDetails();
        System.out.println("-------------------------------------------------");
        simpleJdbcDemo.getEmployeeDetailsInReverse();
        System.out.println("-------------------------------------------------");
        simpleJdbcDemo.getEmployeeDetailsByNameAndGender("Rupa","F");
        System.out.println("-------------------------------------------------");
        simpleJdbcDemo.getEmployeeDetailsFromSecondRowInReverse();
        System.out.println("-------------------------------------------------");
        ResultSetMetadataDemo resultSetMetadataDemo=new ResultSetMetadataDemo();
        resultSetMetadataDemo.ShowResultsetMetaData();
        System.out.println("-------------------------------------------------");
        DatabaseMetadataDemo databaseMetadataDemo=new DatabaseMetadataDemo();
        databaseMetadataDemo.ShowDatabaseMetaData();
        System.out.println("-------------------------------------------------");
        JdbcBatchDemo jdbcBatchDemo= new JdbcBatchDemo();
        jdbcBatchDemo.ExecuteJdbcBatchDemo();
        System.out.println("-------------------------------------------------");
        JdbcTransactionDemo jdbcTransactionDemo=new JdbcTransactionDemo();
        jdbcTransactionDemo.ExecuteJdbcTransactionDemo();
        RowSetDemo rowSetDemo=new RowSetDemo();
        rowSetDemo.rowSetDemo();
    }
}
