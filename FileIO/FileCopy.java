import java.io.*;

class FileCopy {
    public static void main(String[] args) throws IOException {
          // Read & Write 1 byte at a time. Support Unicode.
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");

            int c;
            byte text[] = {'n', 'e','w', ' ', 'f','i','l','e','\n' };
            out.write(text);
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}