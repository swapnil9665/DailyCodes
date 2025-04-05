import java.util.*;
class Prog5{

public static void main(String args[]){

Scanner sc = new Scanner (System.in);

System.out.println("Enter no. of rows::- ");

int row = sc.nextInt();

int ch = 64+row;

int num = row;
for(int i = 1; i<= row; i++){

	for(int j = 1; j<= row; j++)
	{
		if(i % 2 == 0){

			System.out.print(num+" ");
		} else{
		
			System.out.print(""+(char)ch+" ");
		}
		
		
	
	}
	ch--;
	num--;
	System.out.println();


}


}


}
