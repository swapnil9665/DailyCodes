import java.util.*;



class EnumerationDemo{



	public static void main(String args[]){
	
	
	
	Vector v = new Vector();

	v.add(10);
	v.add(20);
	v.add(30);



	System.out.println("arraylist  =   "+v);

	Iterator itr = v.iterator();



	
	
	

	Enumeration enumItr  = v.elements();



	while(enumItr.hasMoreElements()){
	
	System.out.println(enumItr.nextElement());
	
	
	
	}

	Integer r = 30;
	itr.remove();
	System.out.println(v);

	}








}
