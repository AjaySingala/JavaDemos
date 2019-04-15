import java.io.IOException;

public class GCTest {
    public static void main(String[] args) throws IOException {
        Finalizable fz = new Finalizable();
        System.out.println("calling");
        String txt = fz.readFirstLine();
        System.out.println(txt);
        System.gc();
    }
}