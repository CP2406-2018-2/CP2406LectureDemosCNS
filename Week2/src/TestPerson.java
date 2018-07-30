import javax.swing.*;
import java.util.Scanner;

public class TestPerson {
    public static void main(String[] args) {

        String text = null; // null represents "no object"

        Person person = new Person(text);
        System.out.println(person.says("gday"));

        // data is a "local variable" in the scope of the "main" function
        byte data = -128; // -128 to 127 - 256 values

        // example of the limitations of primiate types
        double a = 0.1;
        double b = 0.2;
        double c = 0.3;

        System.out.println(a + b == c); // this is false!!

        // example of using console input
        Scanner scanner = new Scanner(System.in);
        String userText = scanner.nextLine();

        System.out.println(userText);
    }
}
