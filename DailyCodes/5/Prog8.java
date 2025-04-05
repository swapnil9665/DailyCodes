import java.io.*;

class Prog8{

	public static void main(String args[])throws IOException{
	
		System.out.println("Hello World ");

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String str = br.readLine();

		System.out.println(str);
	
	}




}
