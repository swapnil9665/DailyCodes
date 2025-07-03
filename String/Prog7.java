class Prog7{

public static void main(String args[]){

String str1 = "Rohit";
String str2 = "Ishita";



String str3 = str1 + str2;
System.out.println(System.identityHashCode(str3));//1000



String str4 = "RohitIshita";
String str5 = "Rohit" + "Ishita";
System.out.println(System.identityHashCode(str4));//2000
System.out.println(System.identityHashCode(str5));//2000						  
						 


String str6 = str1 + "Ishita";
System.out.println(System.identityHashCode(str6));//3000






}






}
