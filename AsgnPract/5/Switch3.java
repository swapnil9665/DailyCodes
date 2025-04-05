import java.util.*;
class Switch3{
public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of your cloth in acronym format (XL / L format): ");
        String size=sc.next();

        switch(size){

                case "XL":
                        System.out.println("Extra Large");
                        break;

                case "L":
                        System.out.println(" Large");
                        break;

                case "S":
                        System.out.println("Small");
                        break;


		case "M":
			System.out.println("Medium");
			break;

		case "XS":
                        System.out.println("Extra Small");
                        break;

                default :
                        System.out.println("Invalid Input : privide valid input !!!");
        }
}}
