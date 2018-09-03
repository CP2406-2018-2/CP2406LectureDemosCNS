public class Demos {
    public static void main(String[] args) {
        // final class, final method

        // interface - alternative to multiple-inheritance
        // abstract vs interface

        // abstract class can have 0 or more abstract methods

        // interface is similar to an abstract class with
        // only abstract methods



        try {
            Person person = new Person("Royce", 24);

            Equality other = new Person("Royce", 23);

            if (other.isEquals(person)) {
                System.out.println("you are clones of each other!");
            }
        } catch (PersonException e) {
            System.err.println(e.toString());
        }
    }
}
