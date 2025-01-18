package beginner_project_1.springboot_rest_api.controller;

import beginner_project_1.springboot_rest_api.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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




//    Spring Boot REST API that handles path variable in a request URL
//    {id} - URI template variable
//    http://localhost:8080/students/4/Isuru/Indrajith
//    when the client sends a url like the above, value 4 will be stored in the URI template variable
    @GetMapping("students/{id}/{first-name}/{last-name}")
    public Student studentPathVariable(@PathVariable("id") int studentId,
                                       @PathVariable("first-name") String firstName,
                                       @PathVariable("last-name") String lastname){
//        binding the URI template variable to the "id" method arguement

//        passing the id dynamically to the student
        return new Student(studentId, firstName, lastname );
    }



//    SpringBoot REST API with Request Param
//    REST API that handles Query parameters in a request URL
//    Request URL http://localhost:8080/students/query?id=95&firstName=Lightning&lastName=McQueen

//    @RequestParam => we need to get the query parameter from the URL, by binding the query parameter(id=1) with the method argument

//the REST API URL should be Unique because we are addressing the above List elements
    @GetMapping("students/query")
    //    passed id as the method argument
    public Student studentRequestVariable(@RequestParam int id,
                                          @RequestParam String firstName,
                                          @RequestParam String lastName){
        return new Student(id, firstName,lastName);
    }

}
