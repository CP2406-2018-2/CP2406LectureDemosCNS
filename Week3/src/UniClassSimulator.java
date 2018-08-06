public class UniClassSimulator {


    public static void main(String[] args) {

        Person me = new Person("jase");
        Person you = new Person();

        // System is a class from the Java API
        // out is a static object inside System
        // println is a non-static method of out - what type is out?
        System.out.println(me.name);
        System.out.println(you.name);

        //List<Student> students = new ArrayList<>();

        Student[] students = new Student[40];
        students[0] = new Student();
        students[1] = new Student("Robert", 123321);
        students[2] = new Student();

        System.out.println(students[0].getDetails());


    }
}
