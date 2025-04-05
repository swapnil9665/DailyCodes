import java.util.*;
class RString{


        public static void main(String args[]){    

	Scanner sc = new Scanner(System.in);
	String str1= sc.next();
	System.out.println("Normal :"+str1);

	StringBuffer sb = new StringBuffer(str1);

	str1 = sb.reverse().toString();

	 System.out.println("Reverse :"+str1);

	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       } 
