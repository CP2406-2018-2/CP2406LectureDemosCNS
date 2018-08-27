package model;

public class Musician extends Student {
    private String instrument;
    // implicitly included: name (package scope), age (protected scope), id (package scope)


    public Musician(String name, int age, int id, String instrument) {
        super(name, age, id);
        this.instrument = instrument;

        super.age = 0;

        System.out.println("Musician constructor called");
    }
}
