import java.util.*;
class Prog5{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no. of row::- ");
		int row = sc.nextInt();



		for(int i = 1;i<=row;i++){
			int num = i;
			for(int j = 1;j<=row;j++)
			{
			
			if(j<=row-i){
			
				System.out.print("\t");
			
			}else{
			
				System.out.print(num+"\t");
				num+=i;
			}

			
			
			}
			System.out.println();
		
		
		
		}
	
	
	
	
	}





}
