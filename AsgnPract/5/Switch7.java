import java.util.*;
class Switch7{
public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
	System.out.println(" Platinnum \t Gold \t Silver \t Bronze \n NO_Plan");
        System.out.println("Enter Subscription you are interested in ::- ");
        String sub=sc.next();

        switch(sub){

                case "Platinum":
                        System.out.println("Price is 799");
                        break;

                case "Gold":
                        System.out.println("Price is 599");
                        break;

                case "Silver":
                        System.out.println("Price is 399");
                        break;


		case "Bronze":
			System.out.println("Price is 199");
			break;

		case "NO_Plan":
                        System.out.println("Platform is free with limited aceess");
                        break;

                default :
                        System.out.println("Invalid Input : privide valid input !!!");
        }
}}
