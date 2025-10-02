
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            File file = new File("myFile.txt");
            Scanner Reader = new Scanner(file);

            while(Reader.hasNextLine()){
                String data = Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();
        }
        catch(FileNotFoundException e){
            System.out.println("error");
            e.printStackTrace();
        }
    }
}
