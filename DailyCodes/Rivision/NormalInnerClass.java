class OuterClass{

int x  = 10;
static int y = 20;

void display(){

System.out.println("x = "+x);
System.out.println("static y = "+y);








}

class InnerClass{

	int x = 100;
final static int y = 200;
void displayInner(){


System.out.println(y+"= y x = "+x);

System.out.println(OuterClass.this.x+" = x    y = "+OuterClass.y);

//System.out.println("x = "+this.y);

}


}


}

class Client{

public static void main(String args[]){

OuterClass Oobj = new OuterClass();

OuterClass.InnerClass Iobj = Oobj.new InnerClass();


Iobj.displayInner();

}


}
