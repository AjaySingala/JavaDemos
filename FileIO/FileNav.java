import java.io.*;

class FileNav {
    public static void main(String[] args) {
        String dirName = "D:\\Temp\\JavaTest";

        // Create a new directory.
        File d = new File(dirName);
        d.mkdir();

        // List files and folders.
        File file = null;
        String[] paths;

        try {
            // Create a new File object.
            file = new File("D:\\Temp");

            // Array of files and dirs.
            paths = file.list();

            // for each name in the path array
            for (String path : paths) {
                // prints filename and directory name
                System.out.println(path);
            }
        } catch (Exception e) {
            // if any error occurs
            e.printStackTrace();
        }
    }
}