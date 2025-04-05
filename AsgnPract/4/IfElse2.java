import java.util.*;
class IfElse2{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to check");
	int num=sc.nextInt();

	if(num % 13 == 0 ){
	
		System.out.println(num+" is in the table of 13");


	}else{
	
		System.out.println(num+" is not in the table of 13");
	
	}



}


}
