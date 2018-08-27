package model;

// model.Student is derived / child / sub type
public class Student extends Person {
    int id;
    // implicitly included: name (package scope), age (protected scope)

    public Student(String name, int age, int id) {
        // call model.Person constructor
        super(name,age); // call base class constructor
        this.id = id;
        super.age = 24; // okay to directly access "age"
        System.out.println("student constructor called");
    }
}
