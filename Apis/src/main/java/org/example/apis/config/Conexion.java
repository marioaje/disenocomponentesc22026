package org.example.apis.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    private static  final String URL = "jdbc:mysql://195.35.59.3:3306/u484426513_disenocompc226?useSSL=false&serverTimeZone=UTC";
    private static  final String username = "u484426513_disenocompc226";
    private static  final String password = "S2u4uo#d;70+";


    public static Connection getConecion(){
        try{
            Connection conexion = DriverManager.getConnection(URL,username,password);

            return conexion;

        } catch (Exception e) {
            return  null;
        }



    }
}
