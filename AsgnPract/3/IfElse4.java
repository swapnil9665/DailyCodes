import java.util.*;
class IfElse4{

public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Character :- ");
	char ch='a';
	
	if(ch >= 97 && ch <=122){

		System.out.println(ch + " is in lower case");
	}else if(ch >= 65 && ch <=90 ){
		System.out.println(ch + " is in UPPER CASE");
	}else{
		System.out.println(ch+" is not a alphabet");
	}

}
}
