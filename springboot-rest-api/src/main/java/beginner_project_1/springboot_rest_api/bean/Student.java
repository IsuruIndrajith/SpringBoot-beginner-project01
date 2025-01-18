package beginner_project_1.springboot_rest_api.bean;

//Student class is created as a JAVA BEAN
//when developing REST API we can use this Student java bean as a response
//Spring MUC will convert this JAVA bean(JAVA object) into JSON and will again return to the client.

public class Student {
    private int id;
    private String firstName;
    private String lastName;

//    created a parameterized constructor for the Student class.
    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
