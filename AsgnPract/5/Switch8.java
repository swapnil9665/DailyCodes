import java.util.*;

class Switch8{

	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter num1 :-");
	int num1 = sc.nextInt();

	System.out.println("Enter num2");
	int num2 = sc.nextInt();


	if(num1 >0 && num2 >0){
	

		int result = num1*num2;
		
		switch(result%2){
		
			case 0:
				System.out.println("Result of multiplication is"+result+" and it is even.");
				break;

			 case 1:
                                System.out.println("Result of multiplication is"+result+" and it is odd.");
                                break;
		
		
		}
	
	}else{
	
		System.out.println("Sorry negative numbers not allowed!!");
	}

	
	
	}
}
