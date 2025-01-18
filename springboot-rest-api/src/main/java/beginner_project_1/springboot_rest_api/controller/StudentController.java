package beginner_project_1.springboot_rest_api.controller;

import beginner_project_1.springboot_rest_api.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Making this class a Spring MUC rest controller
@RestController
public class StudentController {

//    Creating REST API
//    Here Student means the return type. This will return an object of the class student
//    Following is the simple java method that returns a student object

//whenever client wants call this REST API, client have to use this API  http://localhost:8080/student
    @GetMapping("student")
    public Student getStudent(){
        Student student = new Student(1, "Isuru", "Indrajith");
        //        above created a Student object
        return student;
    }
}
