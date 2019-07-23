package com.example.javacodesmells;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("value")
@ResponseBody
public class JavaCodeSmellsController {
    
    final private static String GREETING = "Howdy!";
    
    @RequestMapping("/greet") // Noncompliant (source: sonarqube)
    public String greet(String greetee) {
        return GREETING;
    }
}
