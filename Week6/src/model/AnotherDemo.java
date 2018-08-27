package model;

public class AnotherDemo {

    // this main is in the same
    // package as the Person class...
    public static void main(String[] args) {
        Musician muso = new Musician("vangelis", 24, 123, "electronic keyboard");
        muso.age = 10;
        muso.id = 123123; // okay - because AnotherDemo is within
                          // the same package as Person hierarchy classes
    }
}
