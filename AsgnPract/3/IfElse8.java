import java.util.*;
class IfElse8{

public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number :- ");
	int num1=sc.nextInt();
	int num2 = sc.nextInt();
	if(num1 > num2){

		System.out.println(num1 + " is Maximum Between  "+num1+","+num2);
	}else if(num1 < num2){
		System.out.println(num2 + " is Maximum Between "+num1+","+num2);
	}else{
		System.out.println("please enter distinct number both number are equal "+num1+" is equal to  "+num2);
	}

}
}
