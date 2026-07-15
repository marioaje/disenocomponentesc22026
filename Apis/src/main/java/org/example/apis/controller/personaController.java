package org.example.apis.controller;

import org.example.apis.dao.personaDAO;
import org.example.apis.model.personaModel;

import java.util.List;

public class personaController {

    private personaDAO dao = new personaDAO();


    public List<personaModel> listar() {
        return  dao.listar();
    }


}
