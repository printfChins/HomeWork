import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p34 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please input a String");

        try{
            BufferedReader br  = new BufferedReader(
                    new InputStreamReader(System.in));
            String str  = br.readLine();
            System.out.println("Already input a String " + str);
        }catch (IOException e){
            System.out.println("IO Exception happened");
        }
    }
}
