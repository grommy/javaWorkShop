package com.examples.barry.db_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;

class GetData {

   public static void main(String args[]) {

      NumberFormat currency =
          NumberFormat.getCurrencyInstance();

      final String DRIVER =
              "com.mysql.jdbc.Driver";
      final String CONNECTION =
              "jdbc:mysql://localhost/AccountDatabase";


      try {
         Class.forName(DRIVER).newInstance();
      } catch (InstantiationException e) {
         e.printStackTrace();
      } catch (IllegalAccessException e) {
         e.printStackTrace();
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      }

        // UNCOMMENT the lines below.sc
       try (Connection connection =
                    DriverManager.getConnection(CONNECTION, "root", "");

            java.sql.Statement statement =
              connection.createStatement();

            ResultSet resultset =
            statement.executeQuery(
                             "select * from ACCOUNTS")) {

            while(resultset.next()) {
                System.out.println(resultset.getString("NAME"));
                System.out.print(", ");
                System.out.print(resultset.getString("ADDRESS"));
                System.out.print(" ");
                System.out.println(currency.format(
                          resultset.getFloat("BALANCE")));
                }
            } catch (SQLException e) {
            e.printStackTrace();
            }
   }
}
