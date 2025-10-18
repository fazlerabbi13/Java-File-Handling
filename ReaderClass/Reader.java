import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.CharBuffer;
import java.util.Arrays;


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

        if(r.ready()){
            r.read(buffer,0,10);
            out.println("buffer after reading character: " 
            + Arrays.toString(charBuffer.array()));
            

            r.read(charBuffer);

            out.println("Char contents: " 
            + Arrays.toString(charBuffer.array()));

            out.println("next character: " + (char)r.read());
        }

        r.close();

    }
}
