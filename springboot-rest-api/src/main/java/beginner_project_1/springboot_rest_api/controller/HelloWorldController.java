package beginner_project_1.springboot_rest_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//making this java class a spring MUC component
//@Controller

//when using REST API all the rest apis return JSON to the client
//in order to convert Java object into Json, @ResponseBody
//@ResponseBody

//@RestController annotation is the combination of these @Responsebody and @Controller annotations
@RestController
//when we are creating a restful web services using Spring MUC use @RestController

public class HelloWorldController {

//    HTTP GET request
//    this below annotation is to handle HTTP get requests
//    Client accessing URL: http://localhost:8080/hello-world
//    "/hello-world is the directory path that is adding to the end of the "http://localhost:8000""
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World!";
//        This returns a hello world string to the client
    }
}
