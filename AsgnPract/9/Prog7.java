import java.util.*;
class Prog7{


public static void main(String args[]){
Scanner sc = new Scanner (System.in);
System.out.println("Enter no. of rows::- ");
int row = sc.nextInt();

int num1 = row;
for(int i = 1; i <= row; i++){
	int num2  = num1;
	for(int j = 1; j<= row; j++){
	
		System.out.print(num2+" ");
		num2+=row;
	}
	num1--;
	System.out.println();

}












}


}
