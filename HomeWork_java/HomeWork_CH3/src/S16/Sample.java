package S16;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
public class Sample {
    public static void main(String[] args)throws IOException{
        System.out.println("請輸入一個整數");

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int num = Integer.parseInt(str);

        System.out.println("your input number is: "+num);
    }
}
