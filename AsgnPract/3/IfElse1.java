import java.util.*;
class IfElse1{

public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number :- ");
	int num=sc.nextInt();
	
	if(num > 0){

		System.out.println(num + " is Positive numbr");
	}else if(num < 0){
		System.out.println(num + " isNegative number");
	}else{
		System.out.println(num + " is Zero");
	}

}
}
