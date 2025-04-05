import java.util.*;
class IfElse4{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the asumption of marks in percentage ::-");
	float marks=sc.nextInt();

	if(marks > 85 ){
	
		System.out.println(" Medical");


	} else if(marks <=85 && marks > 75){
	
		System.out.println("Engineering");
	
	} else if(marks <=75 && marks > 65){
	
		System.out.println("Pharmacy or Bsc");
	}else if(marks > 100 | marks <0){
		System.out.println("Enter valid Marks");
	}else{
		System.out.println("No Suggestion available!!!");
	}




}


}
