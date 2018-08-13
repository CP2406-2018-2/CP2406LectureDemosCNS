import java.util.Dictionary;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // for loop example:
        for (int i = 1; i <= 100; ++i) {
            System.out.println("i: " + i);
        }

        // a for loop is a "syntactic sugar" for a while loop
        int j = 1;
        // a while loop executes 0 or more times
        while (j <= 100) {
            System.out.println("j: " + j);
            ++j; // j = j + 1
        }


        // a do loop executes 1 or more times
        do {
            System.out.println("j:" + j);
            --j;
        } while (j >= 0);


        {
            // example of using a do-while for user input validation!
            Scanner scanner = new Scanner(System.in);
            int age;
            do {
                age = scanner.nextInt();

            } while (age <= 0 || age >= 10);

            System.out.printf("age: %d\n", age); // formatted string version of console output
        }


        // here is a "primitive array" of string objects
        // primitive arrays are fixed size - this array will only ever contain 3 string objects
        String[] names = {"jack", "jill", "Sick Royce"};
        names[2] = "Happy Royce"; // however, it's possible to change the elements within a primitive array

        // for general loop structure is:
        // for (initialisers; loop condition; steppers) { body }

        for (int i = 0; i < names.length; i += 2) {
            System.out.println(names[i]);
        }

        int x,y;
        for (x = 0, y = 100; x < 100; ++x, --y) {
            System.out.printf("x %d y %d\n", x, y);
        }

        // foreach loop
        for (String name : names) {
            System.out.println(name);
        }

        String name = "Jack";

        // internally, a String object contains a primitive array of characters
        //  0    1     2       3    4
        // 'J'  'a'   'c'     'k'  '\0'

        // \0 is the "null character" - the first entry in the ascii char set

        char letter = '\''; // a char is not the same thing as a String

        System.out.println("\"name\": c:\n\\" + name);
    }
}
