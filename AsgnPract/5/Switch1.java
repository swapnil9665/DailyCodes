import java.util.*;
class Switch1{
public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the color of traffic signal");
        String signal=sc.next();

        switch(signal){

                case "red":
                        System.out.println("Stop!!");
                        break;

                case "green":
                        System.out.println("Go!!");
                        break;

                case "yellow":
                        System.out.println("LOOK and go");
                        break;
                default :
                        System.out.println("Invalid Input!!!");
        }
}}
