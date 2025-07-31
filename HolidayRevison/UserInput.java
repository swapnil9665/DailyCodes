import java.io.*;

public class UserInput{

public static void main(String[] args) throws IOException {
    
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader  br = new BufferedReader(isr);
    System.out.println("Enter wing :- ");
    char ch  =(char) br.read();
    
    
   br.skip(2);
   System.out.println(ch);
    System.out.println("enter name :- ");
    String str1 = br.readLine();
    System.out.println(str1);
    System.out.println("sdff");

}


}