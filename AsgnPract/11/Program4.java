import java.util.*;
class Program4{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("Enter no. of row::- ");
int row  = sc.nextInt();
int num = 65;
for(int i = 1;i<=row;i++){

	for(int j = 1; j<=i; j++){
		
		System.out.print(""+(char)num+"\t");
		num++;
		}

	
	System.out.println();
	}



}




}
