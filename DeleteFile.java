import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
            File file = new File("myFile.txt");
            if(file.delete()){
                System.out.println("deleted file: " + file.getName());

            }else{
                System.out.println("file is not delete.");
            }
    }
}
