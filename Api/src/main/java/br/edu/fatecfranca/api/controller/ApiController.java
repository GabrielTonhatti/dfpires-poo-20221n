package br.edu.fatecfranca.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/bomdia")
    public String bomdia() {
        return "Bom dia!";
    }

    @GetMapping("/boatarde")
    public String boatarde() {
        return "Boa Tarde!";
    }

    @GetMapping("/boanoite/{nome}")
    public String boanoite(@PathVariable String nome) {
        return "Boa Noite " + nome;
    }

}
