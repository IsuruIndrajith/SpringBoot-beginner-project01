package beginner_project_1.springboot_rest_api.controller;

import beginner_project_1.springboot_rest_api.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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


//    Creating a REST API that create a list of students as JSON to the client

//    JAVA method that returns the list of students
//    The return type of the method is a List containing objects of the type Student Class
//    getStudent is the name of the method.

//    to map the incoming HTTP requests to the method, here used @GetMapping annotation
//    this method returns list of students as a JSON to the client
//    client calling request address url: http://localhost:8080/students
    @GetMapping("students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
//        "students" is the variable to hold list of Student objects
        students.add(new Student(44,"Lewis","Hamilton"));
        students.add(new Student(1,"Max", "Verstappen"));
        students.add(new Student(16, "Charles", "Leclerc"));
        students.add(new Student(5,"Sebestian", "Vettle"));
//  Above added are for, creating new Student object by calling the constructor of the Student class.
        return students;
//        returns the students list.
    }

}
