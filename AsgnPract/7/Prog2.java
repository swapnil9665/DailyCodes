import java.util.*;
class Prog2{

	public static void main(String args[]){
	
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter number to set range from :- ");
		int from = sc.nextInt();
		
		System.out.println("Enter number to set range to :- ");
		int to = sc.nextInt();

	
		
		while(from<=to){
			if(from % 5 == 0){
			System.out.println(from);
			}
			
			from++;
		}
	
	}

}
