import java.util.*;
class IfElse3{

public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number :- ");
	int num=sc.nextInt();
	
	if(num > 10){

		System.out.println(num + " is Greater than 10");
	}else if(num < 10){
		System.out.println(num + " is Less than 10");
	}else{
		System.out.println(num+" is eqaul to 10");
	}

}
}
