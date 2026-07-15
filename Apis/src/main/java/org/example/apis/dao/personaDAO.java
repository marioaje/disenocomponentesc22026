package org.example.apis.dao;

import org.example.apis.config.Conexion;
import org.example.apis.model.personaModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class personaDAO {

    private Connection conexion;

    public personaDAO(){
        conexion = Conexion.getConecion();
    }


    public List<personaModel> listar(){

        List<personaModel> listaPersonas = new ArrayList<personaModel>();

        String sql = "Select * from personaProfe";

        try(Statement miConsulta = conexion.createStatement();
            ResultSet resultSet = miConsulta.executeQuery(sql)){

            while(resultSet.next()){
                personaModel objeto = new personaModel();

                objeto.setNombre(resultSet.getString("nombre"));
                listaPersonas.add(objeto);
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener datos");
        }

        return listaPersonas;

    }



}
