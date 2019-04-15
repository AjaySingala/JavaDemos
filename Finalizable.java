import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Finalizable {
    private BufferedReader reader;

    public Finalizable() {
        InputStream input = this.getClass().getClassLoader()
            .getResourceAsStream("file.txt");
        this.reader = new BufferedReader(new InputStreamReader(input));
    }

    public String readFirstLine() throws IOException {
        String firstLine = reader.readLine();
        return firstLine;
    }

    // //@Override
    // protected void finalize() {
    //     System.out.println("finalize() called...");
    //     try {
    //         reader.close();
    //         System.out.println("Closed BufferedReader in the finalizer");
    //     } catch (IOException e) {
    //         System.out.println("ERROR!");
    //     }        
    // }
}