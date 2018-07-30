public class Person {
    private String name; // these are member fields
    private int age;

    public Person(String newName) { // this is a "constructor"
                                    // similar to a python initializer
        name = newName;
        age = 0;
    }

    // the "public" below is coming up highlighted - the IDE is making a suggest...
    // if you click the mouse cursor on "public" you get a suggestion bubble
    public String says(String message) {
        return name + " says " + message;
    }
}
