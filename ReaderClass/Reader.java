
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.CharBuffer;


public class Reader {
    public static void main(String[] args) 
    throws IOException{
        FileReader r = new FileReader("myFile.txt");
        PrintStream out = System.out;

        char[] buffer = new char[10];
        CharBuffer charBuffer = CharBuffer.wrap(buffer);

        if(r.markSupported()){
            r.mark(100);
            out.println("mark is supported");
        }

        r.skip(5);

        
    }
}
