import java.util.*;
class Prog4{


	public static void main(String args[]){
	
	
		Scanner sc = new Scanner (System.in);

		System.out.println("enter start : ");
		int start = sc.nextInt();
		System.out.println("enter end : ");
		int end = sc.nextInt();

		for(int i =start; i<=end ; i++){
		
		
			int sum = 0;
			int num = i;
			while(num > 0){
			
			int rem = num%10;
			sum+=rem;
			num = num/10;

			
			
			
			}

			
			if(i%sum == 0){
			System.out.print(i+",");
			}
		
		}
	
	
	
	}







}
