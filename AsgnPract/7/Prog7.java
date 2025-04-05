import java.util.*;
class Prog7{

	public static void main(String args[]){
	
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter number to set range :- ");
		int N = sc.nextInt();
		int i=1;
		
		while(i<=N){
			System.out.println(i*i*i);
		i++;
		}
	
	}

}
