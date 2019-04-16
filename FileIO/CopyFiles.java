import java.io.*;
import java.nio.channels.FileChannel;

class CopyFiles {
    public static void main(String[] args) throws IOException {
        String src = "D:\\Temp";
        String target = "D:\\Temp2\\";

        File srcDir = new File(src);
        File[] files = srcDir.listFiles();

        File destinationFolder = new File(target);
        if (!destinationFolder.exists()) {
            System.out.println(destinationFolder + " does not exist. Creating...");
            destinationFolder.mkdir();
        }

        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                String srcFilename = files[i].getAbsolutePath();
                String targetFilename = target + files[i].getName();
                System.out.println("Copying " + srcFilename + " to " + targetFilename);

                FileChannel srcCh = new FileInputStream(srcFilename).getChannel();
                FileChannel targetCh = new FileOutputStream(targetFilename).getChannel();
                if (targetCh != null && srcCh != null) {
                    targetCh.transferFrom(srcCh, 0, srcCh.size());
                }

                if (srcCh != null) {
                    srcCh.close();
                }
                if (targetCh != null) {
                    targetCh.close();
                }
            }
        }
        
        // Detele the new folder and it's contents.
        System.out.println("Press <ENTER>> to continue...");
        InputStreamReader cin = new InputStreamReader(System.in);
        cin.read();

        if (destinationFolder.exists()) {
            System.out.println("Deleting  " + destinationFolder + "...");
            files = destinationFolder.listFiles();
            for (int i = 0; i < files.length; i++) {
                System.out.println("Deleting " + files[i].getName());
                files[i].delete();
            }
            destinationFolder.delete();
        }
    }

}