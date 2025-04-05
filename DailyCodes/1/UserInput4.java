import java.io.*;

class UserInput4{
public static void main(String args[])throws IOException {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader bf = new BufferedReader(isr);
	System.out.println("Enter wing ::- ");

	char ch =(char) bf.read();
	isr.skip(1);	

	System.out.println("Wing "+ch);

	System.out.println("Enter name ::- ");
	String str = bf.readLine();
	System.out.println(str);

}



}
