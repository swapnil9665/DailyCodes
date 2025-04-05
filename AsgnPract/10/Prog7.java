import java.util.*;
class Prog7{

public static void main(String args[]){

Scanner sc = new Scanner (System.in);

System.out.println("Enter no. of rows::- ");

int row = sc.nextInt();

//int ch = 64+row;
//int ch2 = 65;

for(int i = 1; i<= row; i++){
	int num=row;
	int ch = 64+row;
	int ch2 = 65;
	for(int j = 1; j<= row; j++)
	{
		if(i%2 == 0){

			System.out.print(j+""+(char)ch2+" ");
		} else{
		
			System.out.print(num+""+(char)ch+" ");
		}

		num--;
		
	
	
	ch--;
	ch2++;
	}
	System.out.println();


}


}


}
