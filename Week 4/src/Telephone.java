import java.util.Scanner;

public class Telephone {

    public static void main(String[] args) {

        // example of a "state machine" - a good use of a switch inside a while loop
        // here I'm simulating a telephone with three states
        // 0 - IDLE state - user can "lift" handset
        // 1 - Ready state - user can "dial" numbers
        // 2 - Call state - user can talk and "end" call

        // each ase in the switch represents a different behaviour for the state machine

        int state = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {

            String input = scanner.nextLine();

            switch (state) {
                case 0:
                    System.out.println("State: idle");
                    if (input.equals("lift")) {
                        state = 1;
                        System.out.println("lifted handset...");
                    }
                    break;
                case 1:
                    System.out.println("State: Ready");
                    if (input.equals("dial")) {
                        System.out.println("dialing...");
                    } else if (input.equals("call")) {
                        System.out.println("calling...");
                        state = 2;
                    }
                    break;
                case 2:
                    System.out.println("State: Call");
                    if (input.equals("end")) {
                        state = 0;
                    }
                    System.out.println("talking: " + input);
            }
        }
    }
}
