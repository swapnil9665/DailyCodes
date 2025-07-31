class Outer{

	
	int x = 10;
static  int y = 20;
	void outDisp(){
		
		

		System.out.println("outer display()");
	
	}

	static class Inner{
	int x  = 100;
//		final static int x = 1; static variable is allowed only with final keyword
	void innDisp(){
             	
		System.out.println("inner display()");
//		System.out.println(Outer.this.x);
		System.out.println(y);
		System.out.println(x);

		
	
	}
	
	

	}


	

public static void main(String args[]){

	Outer outObj1 = new Outer();

	//Inner inn = new Inner(); error cannot find symbol
	Inner innObj1 = new Inner();

	innObj1.innDisp();
	System.out.println(innObj1.x);
//	innObj1.outDisp();




}



}
