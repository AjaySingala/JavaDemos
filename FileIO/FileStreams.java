import java.io.*;

import javax.swing.plaf.synth.SynthSplitPaneUI;

class FileStreams {
    public static void main(String[] args) throws IOException {

        try {
            byte bWrite[] = { 75,76,77,78,79 };
            OutputStream os = new FileOutputStream("test.txt");
            for (int x = 0; x < bWrite.length; x++) {
                os.write(bWrite[x]);
            }
            os.close();

            InputStream is = new FileInputStream("test.txt");
            int size = is.available();
            for (int i = 0; i < size; i++) {
                System.out.println((char) is.read() + " ");
            }
            is.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}