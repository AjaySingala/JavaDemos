import java.io.*;

class BufferedReadWrite {
    public static void main(String[] args) throws IOException {
        String fileName = "sample.txt";

        // write the content in file
        try(BufferedWriter bufferedWriter = 
            new BufferedWriter(new FileWriter(fileName))) {  
            String fileContent = "This is a sample text using Buffered Write.";
            bufferedWriter.write(fileContent);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // read the content from file
        try(BufferedReader bufferedReader = 
            new BufferedReader(new FileReader(fileName))) {  
            String line = bufferedReader.readLine();
            while(line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}