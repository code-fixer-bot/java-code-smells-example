package com.example.javacodesmells;

import org.springframework.web.bind.annotation.RequestMapping;

public class JavaCodeSmellsController {
    @RequestMapping("/greet") // Noncompliant (source: sonarqube)
    public String greet(String greetee) {
        return "Howdy!";
    }
}
