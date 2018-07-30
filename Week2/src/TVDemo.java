public class TVDemo {

    public static void main(String[] args) {

 //       System.out.println(globalValue);

        int value = 42; // initialisation

        value = 0; // assignment
        value = value + 1;
        System.out.println(value);

        TV television = new TV();
        System.out.println(television);
    }

    private int globalValue; // this is "sort of" a global variable
                             // in the sense that it's available in
                             // any of the class method
}
