package br.edu.fatecfranca.api.controller;

import br.edu.fatecfranca.api.model.Cerveja;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CervejaController {

    ArrayList<Cerveja> cervejas = new ArrayList<>();

    @GetMapping("/cerveja/consulta")
    public ArrayList<Cerveja> consulta() {
        return cervejas;
    }

    @PostMapping("/cerveja/insere")
    public ArrayList<Cerveja> insere() {
        return cervejas;
    }

}
