package br.edu.fatecfranca.api.controller;

import br.edu.fatecfranca.api.model.Cerveja;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CervejaController {

    ArrayList<Cerveja> cervejas = new ArrayList<>();

    @GetMapping("/cerveja/consulta")
    public ArrayList<Cerveja> consulta() {
        return cervejas;
    }

    @PostMapping("/cerveja/insere")
    public String insere(@RequestBody Cerveja cerveja) {
        cervejas.add(cerveja);
        return "Cerveja " + cerveja.getMarca() + " inserida com sucesso!";
    }

    @DeleteMapping("/cerveja/remove/{id}")
    public String remove(@PathVariable int id) {
        for (Cerveja cerveja : cervejas) {
            if (cerveja.getId() == id) {
                cervejas.remove(cerveja);
                return "Cerveja removida com sucesso!";
            }
        }

        return "Cerveja não encontrada!";
    }

}
