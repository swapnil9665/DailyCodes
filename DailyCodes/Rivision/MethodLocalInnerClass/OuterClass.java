class Outer{

int x = 10;
static int y = 20;


static void displayOuter(){

	class InnerClassOne{

	int x = 100;
	 int y = 200;

	void displayInner(){
	
	
	System.out.println(y+"= y  x ="+x);
	
	System.out.println(Outer.y+"= y  x =");
	
	}

	}

	InnerClassOne obj = new InnerClassOne();

	obj.displayInner();

}




}

class Client{

public static void main(String args[]){

	Outer Oobj = new Outer();
	Oobj.displayOuter();


}


}

