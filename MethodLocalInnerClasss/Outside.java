class Outside{
int x = 10;

static int y = 20;
void display1(){

class Inner{
	void display(){
	
		System.out.println("disp2() Inner1");
		
		
		System.out.println("x = "+x);

	}
}
	Inner obj = new Inner();
	obj.display();
}

static void display2(){

	class Inner2{
	
	void display(){
	
		System.out.println("x = "+Outside.y);

		System.out.println("disp2() Inner2");
	}

	//Inner2 obj = new Inner2();
	

	}
	Inner2 obj = new Inner2();
	obj.display();

	



} 
}

class Client{

public static void main(String args[]){


Outside objOut = new Outside();


objOut.display1();
objOut.display2();
}


}
