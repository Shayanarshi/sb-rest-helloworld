package in.ashokit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {
    @GetMapping(value = "/hello/{name}")
    public String sayWelcome(@PathVariable String name){
        return "Hello :"+ name + ", Welcome to REST API!";

    }
}
