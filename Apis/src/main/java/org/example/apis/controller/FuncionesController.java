package org.example.apis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FuncionesController {

    @GetMapping
    public String saludo(){
        return "saludo";
    }

}
