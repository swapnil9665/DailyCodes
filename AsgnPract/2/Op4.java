import java.util.*;
class Op4{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter num1:- ");
	int num1=sc.nextInt();
	System.out.println("Enter num2:- ");
	int num2=sc.nextInt();

	System.out.println(num1+"&"+num2+" : "+(num1 & num2));
	System.out.println(num1+"|"+num2+" : "+(num1 | num2));

	System.out.println(num1+"^"+num2+" : "+(num1 ^ num2));
	System.out.println(num1+"<< 1 : "+(num1 << 1));
	System.out.println(num1+">> 1 : "+(num1 >> 1));
	int num3=-7;
	System.out.println(num3+">>> 1 : "+(num1 >>> 1));
	



}
}
