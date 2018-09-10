import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Demos {
    public static void main(String[] args) {
        // data protocols
        // these are pre-defined file formats
        // so you know how to find data
        // in a file

        // random access files

        try {
            RandomAccessFile file = new RandomAccessFile("data.txt", "rw");
            File f = new File("data.txt");
            file.seek(f.length() - 1);

            file.read();

            file.seek(0);

        } catch (FileNotFoundException f) {
            System.err.println("bugger....");
        } catch (IOException i) {
            System.err.println("out of bounds! damn...");
        }





    }
}
