import java.io.*;

class Prog7{

	public static void main(String args[]){
	
		System.out.println("Hello World ");

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String str = br.readLine();

		System.out.println(str);
	
	}




}
