import java.util.*;
class Prog9{


public static void main(String args[]){
Scanner sc = new Scanner (System.in);
System.out.println("Enter no. of rows::- ");
int row = sc.nextInt();

int num = 1;
for(int i = 1; i <= row; i++){
	
	for(int j = 1; j<= row; j++){
	
		if(num%2 == 0){
		
		
		System.out.print(num+" ");
		}else{
		
		System.out.print((num*num)+" ");
		}
		num++;

	}
	
	System.out.println();

}












}


}
