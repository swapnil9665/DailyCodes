class IfElse3{


	public static void main(String arge[]){
	
	char ch='a';
	
	if(ch >= 65 && ch<=90 || ch >=97 && ch <=122){

		if(ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u'){
		System.out.println(ch+" is vowel!!");

	
		}else{
			System.out.println(ch+ " is a consonant!!!");
		}
	}else{
		System.out.println(ch+"  is not a alphabet !!!");
	}

}
	
}
