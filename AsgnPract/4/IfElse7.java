import java.util.*;
class IfElse7{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Cost Price of the product ::- ");
	double cost_price=sc.nextDouble();
	
	System.out.println("Enter Selling Price of the product ::- ");
	double selling_price = sc.nextDouble();

	double result = selling_price - cost_price;


	if(result > 0){
	
		System.out.println("It is profit of "+result);


	}else if (result < 0){
	
		System.out.println("It is Loss of "+result);
	
	} else{
		System.out.println("It is neither Loss nor Profit!!");
	}



}


}
