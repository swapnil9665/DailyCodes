class Prog4{


public static void main(String args[]){

	String str1 = "Shashi";
	String str2 = new String("Shashi");
	String str4 = new String("Shashi");
	String str3 = "Shashi";

	System.out.println(str1 == str2);
	System.out.println(str1.equals(str2));
	System.out.println(System.identityHashCode(str1));
	System.out.println(System.identityHashCode(str2));
	System.out.println(System.identityHashCode(str3));
	System.out.println(System.identityHashCode(str4));

	



}

}
