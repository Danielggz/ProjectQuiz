/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package quizproject;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Daniel García
 * 5 dic 2023
 */
public class ManageDB {
    
    private static Connection conn = null;
    
    public static Connection getConnection(){
        //Create database if not exists
        String user = "root";
        String pwd = "BDRvKy4bZely4JrAc2Pf";
        String dbName = "climateChangeQuiz";
        String url = "jdbc:mysql://localhost:3306/" + dbName;
        
        try{
            conn = DriverManager.getConnection(url, user, pwd);
        }catch(SQLException sqlE){
            System.out.println("Connectiong error: " + sqlE);
        }catch(Exception e){
            System.out.println("Exception Error: " + e);
        }
        return conn;
    }
    
    public void createDB(){
        String url = "jdbc:mysql://localhost:3306";
        String user = "root";
        String pwd = "BDRvKy4bZely4JrAc2Pf";
        try{
            conn = DriverManager.getConnection(url, user, pwd);
        }catch(SQLException sqlE){
            System.out.println("Connectiong error: " + sqlE);
        }catch(Exception e){
            System.out.println("Exception Error: " + e);
        }
        
        try{
            String query = "CREATE DATABASE IF NOT EXISTS climateChangeQuiz";
            Statement st = conn.createStatement();
            st.execute(query);
        }catch(SQLException e)
        {
            System.out.println("Error in connection: " + e);
        }
    }
    
    public void createTables(){
        try{
            String tblQ = "CREATE TABLE questions(number INT PRIMARY KEY, text VARCHAR(200) NOT NULL, imgPath VARCHAR(100), section VARCHAR(50));";
            String tblA = "CREATE TABLE answers(id INT PRIMARY KEY, number INT, text VARCHAR(200), correct BOOLEAN, FOREIGN KEY (number) REFERENCES questions(number));";
            Statement st = conn.createStatement();
            st.execute(tblQ);
            st.execute(tblA);
        }catch(SQLException e)
        {
            System.out.println("Error in connection: " + e);
        }
    }
    
    public void insertQuestions(){
        
    }
    
    public void insertAnswers(){
        
    }
    

    
}
