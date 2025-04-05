import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class javainput  {
    public static void main(String[] args) throws NumberFormatException, IOException{
        InputStreamReader s=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(s);
        try {
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("enter number");
        int i=Integer.parseInt(br.readLine());
        System.out.println(i+"hhgh");
    }
}
