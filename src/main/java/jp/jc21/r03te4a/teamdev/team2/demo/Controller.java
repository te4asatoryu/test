package jp.jc21.r03te4a.teamdev.team2.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {
    @GetMapping
    public String index(){
        return "{\"message\":\"Hello Spring MVC!\"}"
    }
}
