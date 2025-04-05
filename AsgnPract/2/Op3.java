import java.util.*;
class Op3{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first boolean value:- ");
	boolean num1=sc.nextBoolean();
	System.out.println("Enter second boolean value:- ");
	boolean num2=sc.nextBoolean();

	System.out.println("Logical AND : "+num1+" && "+num2+" ="+(num1 && num2) );
	System.out.println("Logical OR : "+num1+" || "+num2+" ="+(num1 || num2) );
	System.out.println("Logical NOT for the first value: !"+num1+" = "+(!num1) );
	 System.out.println("Logical NOT for the second value: !"+num2+" = "+(!num2 ));


	



}
}
