import java.util.*;
class Prog5{

	public static void main(String args[]){
	
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter number to set range :- ");
		int N = sc.nextInt();
		
		
		while(N>=1){
			System.out.println(N+" days remaining!!");
		N--;
		}

		System.out.println(N+" days remaining asginment overduw!!");
	
	}

}
