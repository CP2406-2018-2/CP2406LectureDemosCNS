import java.util.Scanner;

public class Demos {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 10 || age > 20) {
            System.out.println("You are cool!");

            System.out.println("Thank you!");
            //System.exit(0);
        } else { // !(age < 10 || age > 20)
                 // age >= 10 && age >= 20
            if (age % 2 == 0) {
                // is even
            } else {
                //is odd
            }
        }


        if (age > 0 && age < 10) {
            // age must be in the range 1 to 9 inclusive
        } else if (age > 10 && age < 20) {
            // age must be in the range 11 to 19 inclusive
        } else if (age > 20 && age < 30) {
            // age must be in the range 21 to 29 inclusive
        } else {
            // age is in none of the ranges about, so age <= 0 || age >= 30 || age == 10 || age == 20
        }


        // example of a "switch" statement - a syntactic sugar for a limited form of if-else ladder
        char menuItem = 'a';
        switch (menuItem) {
            case 'a':
                System.out.println("menuItem is a");
                break; // DON'T FORGET TO BREAK!!!!!! try commenting out this line....

            case 'b':
                System.out.println("menuItem is b");
                break;

            case 'c':
                System.out.println("menuItem is c");
                break;

            default: // this is like the last "else" in a if-else ladder
                System.out.println("menuItem is not a or b or c");
        }
    }
}
