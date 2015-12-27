package com.examples.barry.db_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class CreateTable {

   public static void main(String args[]) {

//       As datasource:
//       MysqlDataSource dataSource = new MysqlDataSource();
//       dataSource.setUser("root");
//       dataSource.setServerName("localhost");
//       dataSource.setDatabaseName("AcDB");

       // JDBC driver name and database URL

       final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
       final String DB_URL = "jdbc:mysql://localhost/";

//       final String CONNECTION =
//               "jdbc:mysql://localhost:3306/AccountDatabase;create=true";

       //  Database credentials
       final String USER = "root";
       final String PASS = "";

       final String DATABASE = "AccountDatabase";

       Connection conn = null;
       Statement stmt = null;

       try {
           //STEP 2: Register JDBC driver
           Class.forName(JDBC_DRIVER);

           //STEP 3: Open a connection
           System.out.println("Connecting to database...");
           conn = DriverManager.getConnection(DB_URL, USER, PASS);

           //STEP 4: Execute a query
           System.out.println("Creating database...");
           stmt = conn.createStatement();

           try {
               String sql = "DROP DATABASE " + DATABASE;
               stmt.executeUpdate(sql);
           } catch (Exception e) {
               System.out.println("Database didn't exist before");
           }

           String sql = "CREATE DATABASE " + DATABASE;
           stmt.executeUpdate(sql);
           System.out.println("Database created successfully...");

           try{
               if(conn!=null)
                   conn.close();
           } catch(SQLException se) {
               se.printStackTrace();
           }

           System.out.println("Connecting to CREATED database...");
           conn = DriverManager.getConnection(DB_URL + DATABASE, USER, PASS);

           System.out.println("Creating table...");
           stmt = conn.createStatement();

           sql = new StringBuilder().append("create table ACCOUNTS").append(
                   "  (NAME VARCHAR(32) NOT NULL PRIMARY KEY, ").append(
                   "   ADDRESS VARCHAR(32),                   ").append(
                   "   BALANCE FLOAT)                         ").toString();

           stmt.executeUpdate(sql);

           stmt.executeUpdate(
                   String.format("insert into ACCOUNTS values ('Barry Burd', '222 Cyber Lane', 24.02)"));

           stmt.executeUpdate(
                   "insert into ACCOUNTS values                 "
                           + "  ('Joe Dow', '111 Luddite Street', 55.63)");

       } catch(SQLException se){
           //Handle errors for JDBC
           se.printStackTrace();
       } catch(Exception e){
           //Handle errors for Class.forName
           e.printStackTrace();
       } finally{
           //finally block used to close resources
           try {
               if(stmt!=null)
                   stmt.close();
           } catch(SQLException se2){
           }// nothing we can do
           try{
               if(conn!=null)
                   conn.close();
           } catch(SQLException se){
               se.printStackTrace();
           }//end finally try
       }//end try
       System.out.println("Goodbye!");


   }
}
