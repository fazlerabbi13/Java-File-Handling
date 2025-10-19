package FileInput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput {
    public static void main(String[] args) {
        try {
            FileInputStream fi = new FileInputStream("myFile.txt");
            

            // file read character by character
            int ch;
            while((ch = fi.read()) != -1){
                System.out.print((char)ch);
            }

            fi.close();
        
        
        } catch (FileNotFoundException e) {
            System.out.println("file not found.");
        }catch(IOException e){
            System.out.println("an error occured");
        }
    }
}
