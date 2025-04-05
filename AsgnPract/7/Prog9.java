import java.util.*;
class Prog9{

	public static void main(String args[]){
	
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter number to set range from :- ");
		int from = sc.nextInt();
		
		System.out.println("Enter number to set range to :- ");
		int to = sc.nextInt();

		int result;
		int sum=0;
		while(from<=to){
			result = from & 0b00000001;
			if(result == 1){
			sum+=from;
			}
			from++;
		}
	
		System.out.println("sum ::- "+sum);
	}


}
