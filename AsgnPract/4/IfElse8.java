import java.util.*;
class IfElse8{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter percentage ::-");
	float marks=sc.nextInt();

	if(marks > 85 ){
	
		System.out.println("Passed : with First Class Destinction");


	} else if(marks <=85 && marks > 75){
	
		System.out.println("Passed : with First Class");
	
	} else if(marks <=75 && marks > 65){
	
		System.out.println("Passed : with Second Class");
	} else if(marks <=65 && marks >35){
	
		System.out.println("Passed : with Third Class");
	}else if(marks > 100 | marks <0){
		System.out.println("Enter valid Marks");
	}else{
		System.out.println("Fail !!!");
	}




}


}
