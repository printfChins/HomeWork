
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class p36 {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("test1.txt"));
            String str1 = br.readLine();
            String str2 = br.readLine();

            System.out.println("Two String that written into file are");
            System.out.println(str1);
            System.out.println(str2);

            br.close();
        }catch (IOException e){
            System.out.println("IO Exception happened");
        }
    }
}
