import java.util.*;
class Pattern8{
	public static void main(String args[]){
	
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no. of rows::- ");
		int row = sc.nextInt();
		int  ch = 64;
		for(int i = 1; i <= row; i++){
		
			for(int j = 1; j <= row; j++){
				ch++;
				System.out.print(""+(char)ch+"  ");

			
			}
			System.out.println();
		
		}
	
	}



}
