import java.util.*;
class Prog9{

public static void main(String args[]){

Scanner sc = new Scanner (System.in);

System.out.println("Enter no. of rows::- ");

int row = sc.nextInt();

//int ch = 64+row;
//int ch2 = 65;

for(int i = 1; i<= row; i++){
	int num=row;
	int ch = 64+row;
	
	for(int j = 1; j<= row; j++)
	{
		if(i%2 == 0){

			System.out.print(j+" ");
		} else{
		
			System.out.print(""+(char)ch+" ");
		}

		
		
	
	
	ch--;

	}
	System.out.println();


}


}


}
