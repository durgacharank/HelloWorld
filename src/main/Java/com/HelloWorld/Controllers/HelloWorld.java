package com.HelloWorld.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
