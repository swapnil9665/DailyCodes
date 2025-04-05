import java.util.*;


class Prog5{

public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to set range of odd number:- ");
		int N = sc.nextInt();
		

		for(int i=0;i<=N;i++){

			if(i % 2 != 0)
			{
			System.out.println(i+",");
			}


		}


	
	}	


}
