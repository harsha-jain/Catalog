package dev.harsha.catalogService.Controller;

import dev.harsha.catalogService.Services.MyFirstService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {
    private MyFirstService myFirstService;

    public MyFirstController(MyFirstService myFirstService){
        this.myFirstService=myFirstService;
    }
    @GetMapping("/")
    public String sayHi(){
        return "hey There!";
    }
}
