import java.util.*;

public class ArraysDemos {
    public static void main(String[] args) {

        // initialising primitive arrays

        int[] rainfall = new int[12];
        String[] names = new String[100];
        for (int i = 0; i < names.length; i++) {
            // string immutable - "flyweight"
            names[i] = "hello".toUpperCase();
        }

//        String name = "hello";
//
//        // this loop is equivalent to the previous for loop
//        int i = 0;
//        while (i < names.length) {
//            names[i] = new String();
//            i++;
//        }

        System.out.println(Arrays.toString(rainfall));
        System.out.println(Arrays.toString(names));

        System.out.println(rainfall);
        System.out.println(names);

        // array out of bounds exception
        try {
            names[1000000] = "hello";
        } catch (Exception e) {
            System.out.println("error: " + e.toString());
        }
        //System.out.println("done");

        // primitive arrays are objects
        char[][] ticTacToe = new char[3][3];
        for (int i = 0; i < ticTacToe.length; ++i) {
            for (int j = 0; j < ticTacToe[i].length; ++j) {
                ticTacToe[i][j] = '?';
            }
        }

        // ragged array example - each row in this array has a different length
        int[][] data;
        data = new int[10][];
        for (int i = 0; i < data.length; ++i) {
            data[i] = new int[i+1];
            for (int j = 0; j < data[i].length; ++j) {
                data[i][j] = j;
            }
        }

        // display contents of ragged array - using nested foreach loops
        // make note of the type of row and col
        for (int[] row : data) {
            for (int col : row) {
                System.out.print(col + ",");
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(ticTacToe));
        for (char[] row : ticTacToe) {
            System.out.println(Arrays.toString(row));
        }

        ticTacToe[1][1] = 'X';
        ticTacToe[0][2] = 'O';
        ticTacToe[1][0] = 'X';
        ticTacToe[2][0] = 'O';
        ticTacToe[1][2] = 'X';

        for (char[] row : ticTacToe) {
//            System.out.println(Arrays.toString(row));
            for (char col : row) {
                System.out.print(col);
            }
            System.out.println();
        }

        // parallel arrays
        String[] person = {"Royce", "Rob", "Isabelle"};
        int[] age = {21, 20, 24};

        Dictionary<String, Integer> ages;
        //Map<String, Integer>

        // function that returns a new array
        String[] listOfNames = createNames(20);
        // arrays are pass by ref - the array contents are not duplicated
        display(listOfNames);

        // ArrayList
        List<Double> values = new ArrayList<>();

        values.add(3.0);
        values.add((double)42);
        values.add(16.8);
        values.add(12.0);
        values.add(6.0);

        // enums, with switches
        Weekdays day = Weekdays.MONDAY;

        switch (day) {
            case MONDAY:
                System.out.println("it's monday!");
                break;
            case TUESDAY:
            case WEDNESDAY:
            case FRIDAY:
                System.out.println("is it the weekend yet?");
                break;
            default:
                System.out.println("yay!");
        }
    }

    enum Weekdays {
        MONDAY, TUESDAY, WEDNESDAY, FRIDAY, SUNDAY, SUNDAY_PART2
    }

    private static void display(String[] data) {
        for (String value : data) {
            System.out.print(value);
        }
        System.out.println();
    }

    private static String[] createNames(int size) {

        String[] result = new String[size];

//        // note: we can't use a foreach loop to set the values in an array
//        int i = 1;
//        for (String name : result) {
//            name = "bob" + i++;
//        }

        for (int i = 0; i < result.length; ++i) {
            result[i] = "bob" + i;
        }

        return result;
    }

}
