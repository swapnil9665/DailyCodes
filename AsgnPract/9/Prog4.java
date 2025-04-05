import java.util.*;
class Prog4{


public static void main(String args[]){
Scanner sc = new Scanner (System.in);
System.out.println("Enter no. of rows::- ");
int row = sc.nextInt();

int num1 = 1;
for(int i = 1; i <= row; i++){
	int ch = 96+row;
	
	for(int j = 1; j<= row; j++){
	
		System.out.print(""+(char)ch+""+num1+" ");
		num1++;
	}
	System.out.println();

}












}


}
