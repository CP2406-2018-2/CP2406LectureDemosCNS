// The Person class is implementing 2 interfaces
// this the closes thing Java has to multi-inheritance
// since Java only single-inheritance
public class Person extends Object
        implements Equality, Comparable<Person> {

    String name;
    int age;

    // notice the "throws" keyword here
    // it's says that the construct passes on handling of the
    // exception to the calling environment

    public Person(String name, int age) throws PersonException{
        if (name == null) {
            throw new PersonException("name is null");
        } else if (name.length() == 0) {
            throw new PersonException("name is empty");
        } else if (age < 0) {
            throw new PersonException("invalid age");
        }

        // if we get this far in the constructor
        // we know the data being stored in this new object
        // is in some sense valid
        this.name = name;
        this.age = age;
    }


    // here are some examples of using interfaces in your code
    // a class that implements a interface usually implements
    // the methods - like you see here
    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public boolean isEquals(Object object) {
        Person other = (Person) object;
        return this.name.equals(other.name);
    }

    @Override
    public boolean isNotEquals(Object object) {
        return !this.isEquals(object);
    }
}
