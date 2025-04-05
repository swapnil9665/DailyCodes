class Prog5{

	public static void main(String[] args){
	int i = 128;
	Integer j = 128;

	System.out.println(System.identityHashCode(i));
	System.out.println(System.identityHashCode(j));
	
	
	if(i == j ){
	
	System.out.println("Equals");
	}else{
	
	System.out.println("NOT Equals");
	}

	}

}
