import java.util.*;
class Prog8{

	public static void main(String args[]){
	
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter number to set range from :- ");
		int from = sc.nextInt();
		
		System.out.println("Enter number to set range to :- ");
		int to = sc.nextInt();

	
		int sum=0;
		while(from<=to){
			
			sum+=from;
			
			from++;
		}
	
		System.out.println("sum ::- "+sum);
	}


}
