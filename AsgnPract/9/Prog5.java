import java.util.*;
class Prog5{


public static void main(String args[]){
Scanner sc = new Scanner (System.in);
System.out.println("Enter no. of rows::- ");
int row = sc.nextInt();

int ch = 64+row;
for(int i = 1; i <= row; i++){
	
	
	for(int j = 1; j<= row; j++){
	
		System.out.print(""+(char)ch+" ");
		
	}
	ch--;
	System.out.println();

}












}


}
