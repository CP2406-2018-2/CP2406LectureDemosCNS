package main;

import model.Person;

// this is unusual case - but still possible
// its a subclass of a base class in a different package
public class Chef extends Person {
    private String style;
    // implicitly included: age (protected scope)

    public Chef(String name, int age, String style) {
        super(name, age);
        this.style = style;
        this.age = 24; // age is directly accessible
                       // even though this is a different package to where Person is!
                       // protected access stretches beyond the defining package
                       // for derived classes!

//        this.name = "bob"; // error - "name" is package scope back in model package
    }
}
