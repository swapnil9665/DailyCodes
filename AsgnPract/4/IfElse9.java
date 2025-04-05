import java.util.*;
class IfElse9{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter side1 :- ");
	int num1=sc.nextInt();

	System.out.println("Enter Side 2 :- ");
	
	int num2 = sc.nextInt();

	System.out.println("Enter Side 3 :- ");
	int num3 = sc.nextInt();

	if(num1*num1 + num2 * num2 == num3 * num3){
	
		System.out.println(num1+","+num2+" and "+num3+"  are pythagoras triplet!!!");


	}else{
	
		 System.out.println(num1+","+num2+" and "+num3+"  are not pythagoras triplet!!!");
	}



}


}
