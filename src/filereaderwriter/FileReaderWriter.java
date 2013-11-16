package filereaderwriter;
/**
 * @author Tyler
 */
public class FileReaderWriter {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //FileCreator file = new FileCreator();
        //Writer write = new Writer();
        Reader read = new Reader();
        
        //file.createFile("newerData.txt");
        //write.addRecord("John", 30);
        read.locateFile("data.txt");
        read.readFromFile();
        read.closeFile();
        
    }

}
