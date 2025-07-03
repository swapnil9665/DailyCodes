class Prog6{

	public static void main(String[] args){
	String i = "hello";
	String  j = "hello";


	System.out.println(System.identityHashCode(i));
	System.out.println(System.identityHashCode(j));
	
	
	if(i == j ){
	
	System.out.println("Equals");
	}else{
	
	System.out.println("NOT Equals");
	}

	}

}
