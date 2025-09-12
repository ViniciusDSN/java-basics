package com.dolley.hello_world;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String helloWorld(@RequestParam String nome) {
        return "<html><body><img src='https://media.tenor.com/r-PR4hx_F7QAAAAM/hollow-knight-breakdance.gif' width=1900 height=850></body></html>" + nome;
    }

    @PostMapping("/pessoa")
    public Pessoa metodoInsano(@RequestBody Pessoa cavaleiroOco) {
        cavaleiroOco.setDescricao("breakin it down");
        return cavaleiroOco;
    }
}
