package net.springbootbackendcomplex.springbootbackendcomplex.controller;

import net.springbootbackendcomplex.springbootbackendcomplex.model.Pessoa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PessoaController {

    @GetMapping("/pessoa")
    public List<Pessoa> getPessoa(){
        List<Pessoa> pessoa = new ArrayList<>();
        pessoa.add(new Pessoa("Sabrina", "Sousa", 21, "F", "51510776869", "contato", "985889757"));
        pessoa.add(new Pessoa("Sarah", "Sousa", 21, "F", "51510776869", "Contato", "endereco"));

        return pessoa;
    }

}
