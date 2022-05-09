import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Code {

    public static void main(String[] args) {
        try {
            File f = new File("text.txt");
            FileWriter fw = new FileWriter(f);
            int a[] = {32, 12, -89, 203, 2};
            for (int i = 0; i <= 6; i++) {
                System.out.println(a[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
