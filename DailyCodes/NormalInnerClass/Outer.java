class Outer{

int x = 10;
static int y = 20;

Outer(){


System.out.println("in Outer constructor");

}

 void dispOut(){



System.out.println("disp Out");

System.out.println(""+x+"\t"+y);
}


class Inner{

Inner(){
System.out.println("constructor Inn()");
}


int x  = 100;
int y = 200;

void dispInn(){


System.out.println(x);
System.out.println(Outer.y);
System.out.println(Outer.this.x);

}



}
}
class Client{
public static void main(String argsp[]){


	Outer outObj = new Outer();
	
	outObj.dispOut();
	Outer.Inner inObj = outObj.new Inner();
	inObj.dispInn();

}


}
