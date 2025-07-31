import java.io.*;
public class Pattern1  {
    
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);


        System.out.println("enter n ::- ");
        int n = Integer.parseInt(br.readLine());

        for(int i= 1;i<=n;i++){

            for(int j = 1;j<=n;j++){


                System.out.print("* ");


            }
            System.out.println();


        }
        
    }
}
