import java.io.*;
import java.util.*;

class Prog13{

	public static void main(String args[])throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter Society name  ");
		
		String society = br.readLine();
		System.out.println("Enter Wing");
		char wing = br.readLine().charAt(0);
	
		System.out.println("Enter flat no.");
		int flat = Integer.parseInt(br.readLine());

		System.out.println("Enter rent ");
                float   rent = Float.parseFloat(br.readLine());

		System.out.println("Name "+society);
		System.out.println("Flat no. "+flat);
		System.out.println("Wing "+wing);
		System.out.println("Rent "+rent);
	
	}




}
