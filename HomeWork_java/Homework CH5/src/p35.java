import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class p35 {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter fw = new FileWriter("test1.txt");
            PrintWriter pw = new PrintWriter(new BufferedWriter(fw));

            pw.println("Hello!");
            pw.println("GoodBye!");

            pw.close();

            System.out.println("Data already written into file");
        }catch (IOException e){
            System.out.println("IO Exception happened");
        }
    }
}
