import java.util.*;
class IfElse2{
public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Grade");
        String grade=sc.next();

        if(grade.equalsIgnoreCase("O")){
	
		System.out.println("Outstanding");
	}else if(grade.equalsIgnoreCase("A+")){
	
		System.out.println("Excellent");
	}else if(grade.equalsIgnoreCase("A")){
	
		System.out.println("neice");
	}else if(grade.equalsIgnoreCase("B")){
	
		System.out.println("good");
	}else{
		System.out.println("invalid input");
	}

}}
