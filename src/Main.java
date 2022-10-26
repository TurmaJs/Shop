package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String args[]){
        Connection conn = connect();


    }
    /* public static Connection connect(){
        Connection connection = null;

     */

        try {
            connection = DriverManager.getConnection( "jdbc:mysql://localhost:3306/exercise","root","Turmana@112");
        } catch (SQLException e) {
            System.out.println("Could Not Connect to Server!");
            e.getCause();
            System.out.println(e.getErrorCode());
            System.out.println(e.getSQLState());
            e.printStackTrace();
        }
        return connection;
    }
}