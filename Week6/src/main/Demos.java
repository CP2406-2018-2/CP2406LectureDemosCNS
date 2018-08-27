package main;

import model.Musician;
import model.Student;

public class Demos {

    // this main is in its own package scope - separate from the model package
    public static void main(String[] args) {
        // basic inheritance
        // base class, derived class: need to worry about which constructors to create

        // overridden methods
        // uses the @Overridden annotation - a special kind of "comment" in Java

        // polymorphism
        // the actual behaviour of a method call depends on
        // the type of the object (usually a derived class)
        // not the type of the variable (usually a base class)

        // construction call sequence - the base class constructs goes first
        // and the execution works backwards from base to derived along the hierarchy

        /*

Member visibility vs different scopes:

Visibility   Defining Class  Same Package  Subclass in another package  Anywhere

public       Y               Y             Y                            Y
protected    Y               Y             Y                            N
no modifier  Y               Y             N                            N
private      Y               N             N                            N

         */

        Student student = new Student("james", 12, 1216);
        Musician muso = new Musician("vangelis", 24, 123, "electronic keyboard");

        //muso.age = 10; // error - because "age" is protected visibility in Person

        Chef chef = new Chef("frank", 42, "Mediterranean");
        // chef.name = "Frank"; // error - because "name" is package visibility in Person
                               // and Person is in a different package

//        student.id = 123123; // error - because "name" has package visibility in Student

        // super keyword
        // similar to this
        // useful for parent constructor calls
        // and direct access to parent class members

        // this vs super
        // super is "this" for the parent object

        // information hiding
        // a class usually has public methods
        // and non-public member fields
        // the developer can then change the
        // implementation of the class
        // without others noticing

        // access control
        // used to allow access to class members
        // e.g. fields, methods

        // Object class
        // the topmost base class for all class types in Java
        // every class is a derived version of Object

        // abstract class
        // allow you to represent a "concept" that is incomplete in some way
        // e.g. shape hierarchy - a shape is a concept you can't draw a shape directly...

        // packages
        // used to collect related classes together within the same scope
    }
}
