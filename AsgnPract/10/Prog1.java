import java.util.*;
class Prog1{

public static void main(String args[]){

Scanner sc = new Scanner (System.in);

System.out.println("Enter no. of rows::- ");

int row = sc.nextInt();

int num = row * row;

for(int i = 1; i<= row; i++){

	for(int j = 1; j<= row; j++)
	{
	
		System.out.print(num+" ");
		num--;
	
	}
	System.out.println();


}


}


}
