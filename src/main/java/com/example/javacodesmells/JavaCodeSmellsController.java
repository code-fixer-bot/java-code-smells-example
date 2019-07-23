package com.example.javacodesmells;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// controller comment
// responsebody comment
// responsebody comment
@RestController
public class JavaCodeSmellsController {
    @RequestMapping("/greet") // Noncompliant (source: sonarqube)
    public String greet(String greetee) {
        return "Howdy!";
    }
}
