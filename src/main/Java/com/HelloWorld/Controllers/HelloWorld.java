package com.HelloWorld.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class HelloWorld {
    @GetMapping(path = "/getall")
    public String getAllSVD()
    {
        return "Hello World";
    }
}
