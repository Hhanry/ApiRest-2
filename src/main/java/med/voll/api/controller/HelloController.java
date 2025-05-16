package med.voll.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping ("/hello") //url q acessa
public class HelloController {

    @GetMapping
    public String olaMundo() {
        return "Hello world spring!";
    }

}
