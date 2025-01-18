package beginner_project_1.springboot_rest_api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//making this java class a spring MUC component
//@Controller

//when using rest apis all the rest apis return Json to the client
//in order to convert Java object into Json, @Response
//@ResponseBody

//@RestController annotation is the combination of these @Responsebody and @Controller annotations
@RestController
public class HelloWorldController {
}
