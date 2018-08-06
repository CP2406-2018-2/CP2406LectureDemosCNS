import java.util.Random;


public class Person {
    String name; // member fields - "has-a"
    // composition

    // a standard way to create
    // an "initial-value" constructor
    // for a "plain-old-Java-object" (POJO) class
    public Person(String name) {
        this.name = name;
    }

    // this is the "default constructor"
    // a class can have any number of constructors
    public Person() {
        // I want to make a random string
        // for the name - but the Random API
        // doesn't have want I needed exactly
        // so I have to build my own code
        // based on what it provides

        Random random = new Random();
        name = "";
        final int size = random.nextInt(10) + 3;
        for (int i = 0; i < size; ++i) {
            int charIndex = random.nextInt(26);
            char letter = (char) ('A' + charIndex);
            name = name + letter;
        }
    }
}
