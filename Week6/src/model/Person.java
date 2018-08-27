package model;

// model.Person is the "base" class / parent class / super type
public class Person {
    String name; // package scope
    protected int age;

    // default constructor gets added implicitly
    // if you don't create any constructors!
    // but we have one, so no default constructor

    // this is an initial value constructor
    public Person(String name, int age) {
        System.out.println("person constructor called");
        this.name = name;
        this.age = age;
    }

    // accessors -- "getter" methods
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    // mutators -- "setter" methods
    public void hasBirthday() {
        age += 1;
    }
    public void changeName(String name) {
        this.name = name;
    }
}
