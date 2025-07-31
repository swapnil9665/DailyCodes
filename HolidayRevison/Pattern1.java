
import java.io.*;
public class Pattern1  {
    
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);


        System.out.println("enter n ::- ");
        int n;
        //  n = Integer.parseInt(br.readLine());
        n = 4;
        for(int i= 1;i<=n;i++){

            for(int j =1;j<=n-i+1;j++){


                System.out.print("* ");


            }
            System.out.println();


        }
        
    }
}
