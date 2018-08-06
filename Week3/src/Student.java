public class Student extends Person {

    int id; // default value for int member field 0
    String courseName;


    public Student() {
        super("???"); // use the Person constructor
    }

    public Student(String name, int id) {
        super(name);
        this.id = id;
    }

    public String getDetails() {
        return name + id + courseName;
    }
}
