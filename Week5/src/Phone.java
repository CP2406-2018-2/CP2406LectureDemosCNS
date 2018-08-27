import java.util.ArrayList;
import java.util.List;

public class Phone {

    enum State { // represents the current state of the phone
        IDLE, READY, CALL, ERROR
    }

    enum Action { // indicates the desired action
        LIFT, DIAL, CALL, END;

        // an enum is syntactic sugar for a class in Java
        // use can add constructors and member fields to it
        int value;
        String message;
        Action() {
            value = 0;
            message = "";
        }
        Action set(int value) {
            this.value = value;
            return this;
        }
        Action set(String message) {
            this.message = message;
            return this;
        }
    }

    // note: the enums above are "nested" inside the Phone class
    // it is of course possible to have enums declared outside a class...

    private State state;
    private List<Integer> digits;

    public Phone() {
        state = State.IDLE;
        digits = new ArrayList<>();
    }

    public void action(Action action) {
        System.out.print("current state: " + state);
        System.out.println(" current action: " + action);

        switch (state) {
            case IDLE:
                if (action == Action.LIFT) {
                    System.out.println("ready...");
                    state = State.READY;
                } else {
                    state = State.ERROR;
                }
                break;

            case READY:
                switch (action) {
                    case DIAL:
                        System.out.println("dialing " + action.value);
                        digits.add(action.value);
                        break;
                    case CALL:
                        System.out.println("calling: " + digits);
                        state = State.CALL;
                        break;
                    default:
                        state = State.ERROR;
                }
                break;

            case CALL:
                switch (action) {
                    case CALL:
                        System.out.println("message so far: " + action.message);
                        break;
                    case END:
                        System.out.println("call ended");
                        state = State.IDLE;
                        digits.clear();
                        break;
                    default:
                        state = State.ERROR;
                }
        }
    }

    public static void main(String[] args) {
        // test Phone class - a better version of the Telephone e.g from last week

        // try changing the sequence of action and see how the state machine reacts!
        Phone phone = new Phone();
        phone.action(Action.LIFT);

        phone.action(Action.DIAL.set(1));
        phone.action(Action.DIAL.set(2));
        phone.action(Action.DIAL.set(3));
        phone.action(Action.CALL);

        phone.action(Action.CALL.set("hello?"));
        phone.action(Action.CALL.set("anyone there?"));
        phone.action(Action.END);
    }
}
