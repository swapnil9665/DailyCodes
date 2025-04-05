import java.util.*;


class Prog9{

public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  a number to set range of natural number  :- ");
		int N = sc.nextInt();
		
		int sum=0;
		for(int i=1;i<=10;i++){

			sum+=i;
		//	System.out.println(i*N);
			


		}
		System.out.println("the sum of first "+N+" natural number is"+sum);

	
	}	


}
