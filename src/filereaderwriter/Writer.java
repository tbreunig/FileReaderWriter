package filereaderwriter;
/**
 *
 * @author Tyler
 */

import java.io.*;
import java.lang.*;
import java.util.*;

public class Writer {
    private Formatter file;
    //FileCreator fileCreator;
   
    /**
     *
     */
    public void addRecord(String name, int age){
        file.format("%s" + " | " + "%i");
    }
    
    /*
     * 
     */
    public void closeFile(){
        file.close();
        }
    }
