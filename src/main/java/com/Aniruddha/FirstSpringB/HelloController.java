package com.Aniruddha.FirstSpringB;

import org.springframework.web.bind.annotation.*;

@RestController //It's like saying, "This class will listen for web requests
// and send back response
public class HelloController {
    @GetMapping("/hello") //this is an endpoint
    //we will mention all of the endpoints in here
    public HelloResponse hello(){
        return new HelloResponse("Hello world!");
    }

    @GetMapping("/hello/{name}")
    public HelloResponse helloParam(@PathVariable String name){
        return new HelloResponse("Hello, "+name+" !");
    }

    @PostMapping("/hello")
    public HelloResponse helloPost(@RequestBody String name){
        return new HelloResponse("Hello"+name+"!");
    }
}
