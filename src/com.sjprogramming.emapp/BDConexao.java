package com.sjprogramming.emapp;

import java.sql.Connection;
import java.sql.DriverManager;

public class BDConexao {
    static Connection con;
    public static Connection criarBDConexao(){

        try{
            //carregar driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //conectar
            String url="jdbc:mysql://localhost:3306/funcionariobd";
            String username="root";
            String password="Milena11*";
            con=DriverManager.getConnection(url, username, password);

        }catch (Exception ex){
            ex.printStackTrace();
        }
        //get connection
        return con;

    }
}
