import java.util.*;



class IteratorDemo{



	public static void main(String args[]){
	
	
	
	ArrayList aList = new ArrayList();

	aList.add(10);
	aList.add(20);
	aList.add(30);
	aList.add(40);


	System.out.println("arraylist  =   "+aList);

	//Iterator itr = aList.iterator();


	ListIterator litr = aList.listIterator();
	System.out.println(aList);

	while(litr.hasNext()){


		if((int)litr.next() == 30){
		
		litr.set(3.0);
		}


		//System.out.println(itr.next());
	
			
	
	
	}	



	System.out.println(litr.previousIndex());
	
	



	/*ListIterator itr2 = aList.listIterator();

	while(itr2.hasNext()){
	
	
	System.out.println(itr2.next());
	
	}	


	while(itr2.hasPrevious()){
	
	System.out.println(itr2.previous());
	
	
	}


System.out.println("next =   "+itr2.next());
System.out.println("previous = "+itr2.previous());

*/
	}








}
