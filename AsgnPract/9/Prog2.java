import java.util.*;
class Prog2{


public static void main(String args[]){
Scanner sc = new Scanner (System.in);
System.out.println("Enter no. of rows::- ");
int row = sc.nextInt();


for(int i = 1; i <= row; i++){
	int num = 96+row;
	for(int j = 1; j<= row; j++){
	
		System.out.print(""+(char)num+" ");
		num--;
	}
	System.out.println();

}












}


}
