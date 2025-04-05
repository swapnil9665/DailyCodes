import java.util.*;
class Prog3{

	public static void main(String args[]){
	
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter number to set range from :- ");
		int from = sc.nextInt();
		
		System.out.println("Enter number to set range to :- ");
		int to = sc.nextInt();

	
		
		while(from<=to){
			if(from % 4 == 0 || from % 7 == 0){
			System.out.println(from);
			}
			
			from++;
		}
	
	}

}
