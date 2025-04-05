import java.util.*;


class Prog10{

public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  a number to set range of number:- ");
		int N = sc.nextInt();
		
		int count=0;
		for(int i=1;i<=10;i++){
			if( i % 2 != 0)
			count++;
		//	System.out.println(i*N);
			


		}
		System.out.println("the count of odd number from 1 to "+N+"  is"+count);

	
	}	


}
