
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("myFile.txt");
            writer.write("hi!i am fazle rabbi");
            writer.close();

            System.out.println("written successfully");
        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }
}
