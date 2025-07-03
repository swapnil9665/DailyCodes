import java.io.*;

class Prog10{

	public static void main(String args[])throws IOException{
	
		System.out.println("Hello World ");

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter num1");
		 int num1 = Integer.parseInt(br.readLine());

		 System.out.println("Enter num2");
                 int num2 = Integer.parseInt(br.readLine());

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1+num2);
	
	}




}
