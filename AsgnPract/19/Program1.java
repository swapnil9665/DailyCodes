import java.util.*;
class Prog1{


	public static void main(String args[]){
	
	
		Scanner sc = new Scanner (System.in);

		System.out.println("enter start : ");
		int start = sc.nextInt();
		System.out.println("enter end : ");
		int end = sc.nextInt();

		for(int i =start; i<=end ; i++){
		
		
			int sum = 0;
			for(int j = 1;j<=i/2;j++){
			
				if(i % j == 0){
				
					sum+=j;
				}
			}
			if(sum == i){
			System.out.print(i+",");
			}
		
		}
	
	
	
	}







}
