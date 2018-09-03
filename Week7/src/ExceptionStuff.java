public class ExceptionStuff {
    public static void main(String[] args) throws PersonException {


        // review exceptions
        // caused when part of the code fails to execute
        // the virtual machine stops normal execution and switches into "exception handling" mode
        // looking for a try/catch block in the current function or calling function
        // to handle the exception object

        // Throwable, Error, Exception,
        // Error is for Java virtual machine errors - not caused by your code
        // Throwable is the parent type of all exceptions
        // Exception is the parent type of exceptions you have to worry about
        // e.g. FileNotFoundException, NullPointerException, ...

        // try, catch, finally, throw,


        // no need for try/catch - since the main() method is "throws" :)
        // this is cheating sort of...

            Person person = new Person("", -1);
        // checked and unchecked exceptions


        // another example of a checked exception
        // that we must handle...
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // assert

    }
}
