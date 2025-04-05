import java.util.*;

class Prog9{
//Accessing StringTokenizer's element  in java using while loop

public static void main(String args[]){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Empname , Cmpname , Salary , Location ::- ");
	String data = sc.nextLine();

	StringTokenizer st = new StringTokenizer(data," ");

	while(st.hasMoreTokens()){
	
		System.out.println(st.nextToken());
	
	
	}


}








}
