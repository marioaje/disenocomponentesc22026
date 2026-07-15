package org.example.apis.viewapi;

import org.example.apis.controller.personaController;
import org.example.apis.model.personaModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class personAPI {

    personaController personaController = new personaController();

    @GetMapping
    public List<personaModel> listar() {
        return  personaController.listar();
    }

}
