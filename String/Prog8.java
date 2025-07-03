import java.util.*;

class Prog8{
//StringTokenizer in java

public static void main(String args[]){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Empname , Cmpname , Salary , Location ::- ");
	String data = sc.nextLine();

	StringTokenizer st = new StringTokenizer(data," ");

	System.out.println("Emp name:- "+st.nextToken());
	System.out.println("Cmp name:- "+st.nextToken());
	System.out.println("Salary:- "+st.nextToken());
	System.out.println("Location:- "+st.nextToken());


}








}
