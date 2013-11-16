package filereaderwriter;

import java.util.Scanner;
import java.io.*;
import java.util.*;

/**
 *
 * @author Tyler
 */
public class Reader {

    private Scanner fileScanned;

    public void locateFile(String fileName) {
        try {
            fileScanned = new Scanner(new File(fileName));
        } catch (Exception e) {
            System.out.println("*!* File Not Found *!*");
        }
    }

    public void readFromFile() {
        try {
            while (fileScanned.hasNext()) {
                String a = fileScanned.next();
                String b = fileScanned.next();

                System.out.printf("%s" + " | " + "%i\n", a, b);
            }
        } catch (Exception e) {
            //System.out.println("File name was Null. Please enter a valid file name");
        }
    }

    public void closeFile() {
        try {
            fileScanned.close();
        } catch (Exception e) {
            System.out.println("File name was Null. Please enter a valid file name");
        }
    }
}
