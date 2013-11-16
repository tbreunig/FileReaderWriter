package filereaderwriter;

/**
 * @author Tyler
 */
import java.io.*;
import java.lang.*;
import java.util.*;

public class FileCreator {

    private Formatter file;
    private String fileName;

    public void createFile(String fileName) {
            try {
                file = new Formatter(fileName);
                System.out.println("File successfully created!");
            } catch (IOException e) {
                System.out.println("Error creating the file. Please try again.");
            }
        }
    
}
