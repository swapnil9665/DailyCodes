import java.io.*;
import java.util.*;

class Prog6{

	public static void main(String args[]){
	
		System.out.println("Enter Society name  ");
		//int  ch = System.in.read();
		Scanner sc = new Scanner(System.in);
		String society = sc.next();

		System.out.println("Enter flat no");
		int flat = sc.nextInt();

		System.out.println("Enter Wing");
                char wing = sc.next().charAt(0);

		System.out.println("Enter rent ");
                int   rent = sc.nextInt();

		System.out.println("Name "+society);
		System.out.println("Flat no. "+flat);
		System.out.println("Wing "+wing);
		System.out.println("Rent "+rent);
	
	}




}
