import java.util.*;
class IfElse6{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your age :- ");
	int age=sc.nextInt();

	if(age > 0){
		if(age >=18){
			System.out.println("Valid age for Voting.");
		}else {
			System.out.println("Invalid age for Voting");
		}
	
	
	}else{
	
		System.out.println(age+" invalid age : enter valid age.");
	}



}


}
