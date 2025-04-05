import java.util.*;
class IfElse5{

public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number :- ");
	int num=sc.nextInt();
	
	if(num % 7 ==0){

		System.out.println(num + " is Divisible by 7");
	}
	else{
		System.out.println(num + " is not Divisible by 7");
	}

}
}
