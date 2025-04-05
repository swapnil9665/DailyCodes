class Prog1{

public static void main(String args[]){
	/*StringBuffer sb1 = new StringBuffer("Jayesh");
	String str1 = new String("Jayesh");
	System.out.println(sb1);
	System.out.println(System.identityHashCode(sb1));
	System.out.println(System.identityHashCode(str1));
*/

	StringBuffer sb1 = new StringBuffer("ABC");
	
	StringBuffer sb2 = new StringBuffer();

	System.out.println(sb1.capacity());//19
	
	System.out.println(sb2.capacity());//16
	
	sb1.append("1234567890123456789");//40
	
	sb2.ensureCapacity(100);
	
	System.out.println(sb1.capacity());//40
        
	System.out.println(sb2.capacity());//100
	
	sb2.ensureCapacity(50);
	
	sb1.ensureCapacity(30);
	
	System.out.println(sb1.capacity());///40
        
	System.out.println(sb2.capacity());//100
	
	System.out.println(sb1);//ABC1234567890123456789
}



}
