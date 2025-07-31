import java.util.*;

class Demo{


public static void main(String args[]){


	System.out.println("Enter your names comma seperated:- ");
	
	Scanner sc = new Scanner(System.in);

	String str1 = sc.nextLine();
//	String str2 = sc.next();

	System.out.println(str1);
//	System.out.println(str2);

	StringTokenizer st = new StringTokenizer(str1);
	System.out.println(st.countTokens());
	while(st.hasMoreTokens()){
	
	System.out.println(st.nextToken());
	}
	System.out.println(st.countTokens());




}


}
