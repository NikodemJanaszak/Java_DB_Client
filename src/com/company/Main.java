package com.company;
import java.sql.*;

public class Main {

    public static void main(String[] args) {

        try{
            //Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/planner?useLegacyDatetimeCode=false&serverTimezone=UTC", "admin", "adminadmin");
            Statement stmt=con.createStatement();
            System.out.println("Połączono");
            ResultSet rs=stmt.executeQuery("select * from plan");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2));
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}

//have to add mySQL connector