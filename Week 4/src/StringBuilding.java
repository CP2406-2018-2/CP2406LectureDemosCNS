import java.util.ArrayList;

public class StringBuilding {

    public static void main(String[] args) {

        // primitive types: int, double, float, char, byte, boolean, short, long
        // Wrapper classes for the primitive types: Integer, Double, Float, Character, Byte, Boolean, ...
        Integer value = new Integer(42); // 42 is wrapped inside an Integer object


        // Wrapper classes like Integer allow you o make an arraylist of integers
        // normally you can't create an arraylist of primitive values directly
        ArrayList<Integer> names = new ArrayList<>();
        names.add(42); // this is called "Autoboxing"
                       // the primitive value 42 is wrapped in an object new Integer(42)
                       // so the code becomes: names.add(new Integer(42));

        int data = names.get(0); // this is auto-unboxing
                                 // the primitive value inside the object
                                 // is automatically retrieved from the Integer object

        String text = "";
        for (int i = 0; i < 100; ++i) {
            text = text + i; // overloaded for string concatenation
                             // this is quite slow code
                             // every time around the loop new temporary
                             // string objects are created and destroyed over and over again...
        }
        System.out.println("text: " + text);

        //StringBuffer - is a much better way to build a string from smaller strings
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100; ++i) {
            builder.append(i);
        }
        System.out.println("text: " + builder.toString());
    }

}
