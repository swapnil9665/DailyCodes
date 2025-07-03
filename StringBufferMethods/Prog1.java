class Prog1{

	public static void main(String args[]){
	
	//	StringBuffer sb0 = "Jadu";//incompatible types
	
		StringBuffer sb = new StringBuffer("Kedar");

	System.out.println(sb.length());//5
	System.out.println(sb.capacity());//21
	System.out.println(sb.charAt(2));//d
	
	sb.append("Jadhav");

	System.out.println(sb);//KedarJadhav
	System.out.println(sb.reverse());//vahdaJradeK
	sb.reverse();//KedarJadhav
	
	sb.insert(5,"Mahadev");
	System.out.println(sb);//KedarMahadevJadhav
	
	System.out.println(sb.toString());

	//System.out.println(sb.toUpperCase()); //no such method is present in StringBuffer Class

	System.out.println(sb.deleteCharAt(0));//edarMahadevJadhav
	System.out.println(sb.indexOf("e"));//0

	
	System.out.println(sb.substring(4,11));//Mahadev


	}










}
