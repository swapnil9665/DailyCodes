import java.util.*;
class IfElse10{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);

	int choice=1;

	while(choice != 0){
	System.out.println("Calculator");

	System.out.println(" 1 for Addition\n2 for Subtraction\n3 for Multiplication \n4 division \n5 Modulous \n 0 Exit\n Enter your choice");

	choice = sc.nextInt();

	//System.out.println("Enter First number ");

	//double num1 = sc.nextDouble();

	//System.out.println("Enter Second number ");
	//double num2 = sc.nextDouble();
	double num1,num2,result;
	switch (choice){
	
		case 1:
			System.out.println("Enter First number ");

        		 num1 = sc.nextDouble();

        		System.out.println("Enter Second number ");
        		 num2 = sc.nextDouble();
			result = num1 + num2;
			System.out.println("Addition:  "+result);
			break;

		 case 2:
			 System.out.println("Enter First number ");

                         num1 = sc.nextDouble();

                        System.out.println("Enter Second number ");
                         num2 = sc.nextDouble();
                        result = num1 - num2;
                        System.out.println("Subtraction:  "+result);
                        break;

		 case 3:
			 System.out.println("Enter First number ");

                         num1 = sc.nextDouble();

                        System.out.println("Enter Second number ");
                         num2 = sc.nextDouble();
                        result = num1 * num2;
                        System.out.println("Multiplication:  "+result);
                        break;

		 case 4:

			 System.out.println("Enter First number ");

                         num1 = sc.nextDouble();

                        System.out.println("Enter Second number ");
                         num2 = sc.nextDouble();
                        result = num1 / num2;
                        System.out.println("Division:  "+result);
                        break;

		 case 5:
			 System.out.println("Enter First number ");

                         num1 = sc.nextDouble();

                        System.out.println("Enter Second number ");
                         num2 = sc.nextDouble();
                        result = num1 % num2;
                        System.out.println("Modulous:  "+result);
                        break;

		case 0:
		       System.out.println("Exited");	
	
	
	
	}



	
	
	
	
	
	}





}


}
