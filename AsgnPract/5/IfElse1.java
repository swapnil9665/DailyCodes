import java.util.*;
class IfElse1{
public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the color of traffic signal");
        String signal=sc.next();

        if(signal.equals("RED")|| signal.equals("red")){
	
		System.out.println("Stop");
	
	}else if(signal.equals("GREEN") && signal.equals("green")){
	
		System.out.println("Go");
	}else if(signal.equals("YELLOW") && signal.equals("yellow")){
		System.out.println("Look and go");
	}else {
	System.out.println(signal+" := invalid color.");
	}

}}
