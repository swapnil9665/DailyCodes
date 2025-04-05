import java.util.*;
class Program10{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("Enter no. of row::- ");
int row  = sc.nextInt();


int r = row;
for(int i = 1;i<=row;i++){
		int num = r;
	for(int j = 1; j<=row-i+1; j++){
		
		System.out.print(num+"\t");
		num +=r;
		
		
		}
	r--;
	

	
	System.out.println();
	}



}




}
