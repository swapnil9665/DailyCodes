import java.util.*;
class Switch4{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);

	 String choice="0";


	System.out.println("Calculator");

	System.out.println(" + for Addition\n- for Subtraction\n* for Multiplication \n/ division \n% Modulous \n 0 Exit\n Enter your choice");

	choice = sc.next();

	//System.out.println("Enter First number ");

	//double num1 = sc.nextDouble();

	//System.out.println("Enter Second number ");
	//double num2 = sc.nextDouble();
	double num1,num2,result;
	switch (choice){
	
		case "+":
			System.out.println("Enter First number ");

        		 num1 = sc.nextDouble();

        		System.out.println("Enter Second number ");
        		 num2 = sc.nextDouble();
			result = num1 + num2;
			System.out.println("Addition:  "+result);
			break;

		 case "-":
			 System.out.println("Enter First number ");

                         num1 = sc.nextDouble();

                        System.out.println("Enter Second number ");
                         num2 = sc.nextDouble();
                        result = num1 - num2;
                        System.out.println("Subtraction:  "+result);
                        break;

		 case "*":
			 System.out.println("Enter First number ");

                         num1 = sc.nextDouble();

                        System.out.println("Enter Second number ");
                         num2 = sc.nextDouble();
                        result = num1 * num2;
                        System.out.println("Multiplication:  "+result);
                        break;

		 case "/":

			 System.out.println("Enter First number ");

                         num1 = sc.nextDouble();

                        System.out.println("Enter Second number ");
                         num2 = sc.nextDouble();
                        result = num1 / num2;
                        System.out.println("Division:  "+result);
                        break;

		 case "%":
			 System.out.println("Enter First number ");

                         num1 = sc.nextDouble();

                        System.out.println("Enter Second number ");
                         num2 = sc.nextDouble();
                        result = num1 % num2;
                        System.out.println("Modulous:  "+result);
                        break;

		case "0":
		       System.out.println("Exited");	
	
	
	
	}



	
	
	
	
	
	}





}




