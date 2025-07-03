class Prog6{

	public static void main(String args[]){
	
	
		String str1 = "Jayesh";
		String str2 = "Poonam";
		String str3 = str1 + str2;
		String str4 = "JayeshPoonam";
		
		String str5 = str1.concat(str2);



		System.out.println("1 "+System.identityHashCode(str1));
		System.out.println("2 "+System.identityHashCode(str2));
		System.out.println("3 "+System.identityHashCode(str3));	
		System.out.println("4 "+System.identityHashCode(str4));
		System.out.println("5 "+System.identityHashCode(str5));
	
		}

















}
