import java.io.*;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class FileDemos {
    public static void main(String[] args) {

        // file system basics - files, folders, pathnames
        // volatile, non-volatile
        // text files, binary files

        // FileSystems.getDefault() . getPath()

        // I added the "res" folder to this Intellij Project
        // and made it a "resource root"
        // this enables easy access to files you place
        // within that folder
        File file = new File("Week7/res/data.txt");

        try {
            Scanner scanner = new Scanner(file);

            while (true) {
                if (!scanner.hasNextLine()) {
                    break;
                }
                String line = scanner.nextLine();
                System.out.println("line: " + line);
            }

        } catch (NoSuchElementException n) {

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }


        try {
            // you have to build up a BufferReader from "smaller" pieces
            // this is an example of the "decorator" design pattern
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("Week7/res/data.txt")));

            while (true) {
                String line = reader.readLine();
                System.out.println("LINE: " + line);
                if (line == null) {
                    break;
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException i) {
            System.out.println("aghhH!!!");
        }


        // here is an example of writing to a file
        // notice how similar this is to System.out :)
        // that's because System.out is of type PrintWriter :)
        try {
            PrintWriter writer = new PrintWriter("new.txt");

            writer.println("kewl banananas");
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }
}
