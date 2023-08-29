package com.generation.helloworld.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endpoint")
public class EndpointsController {

    @GetMapping("/helloworld")
    public String helloWorld(){
        return "Hello World!";
    }

    @GetMapping("/bsm")
    public String bsm(){
        return "Mentalidade de Crescimento\n" +
                " Persistencia\n" +
                " Responsabilidade pessoal\n" +
                " Orientação ao futuro\n" +
                " Orientação ao detalhe\n" +
                " Proatividade\n" +
                " Trabalho em equipe";
    }

    @GetMapping("objetivos")
    public String objetivos(){
        return "Melhorar orátoria," +
                " Aprender melhor sobre jwt," +
                " Comer menos doces" +
                " Realizar desafios do hackerrank" +
                " Terminar a nova implementação do projeto voluntário" +
                " ser melhor que ontem";
    }
}
