import java.io.*;

class ReadWriteText {
    public static void main(String[] args) throws IOException {
        String fileName = "sample.txt";

        // write the content in file
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            String fileContent = "This is a sample text.";
            fileWriter.write(fileContent);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        // read the content from file
        try (FileReader fileReader = new FileReader(fileName)) {
            int ch = fileReader.read();
            while (ch != -1) {
                System.out.print((char) ch);
                ch = fileReader.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}