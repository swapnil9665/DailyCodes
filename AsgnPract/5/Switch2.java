import java.util.*;
class Switch2{
public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Grade");
        String grade=sc.next();

        switch(grade){

                case "O":
                        System.out.println("Outstanding");
                        break;

                case "A+":
                        System.out.println("Excellent");
                        break;

                case "A":
                        System.out.println("Very Good");
                        break;


		case "B":
			System.out.println("Neice");
			break;

		case "C":
                        System.out.println("Passed!");
                        break;

                default :
                        System.out.println("Invalid Input : privide valid input !!!");
        }
}}
