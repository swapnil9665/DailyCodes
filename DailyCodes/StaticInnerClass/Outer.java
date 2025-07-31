class Outer{
int x  = 10;
static int y = 20;

void dispOut(){


System.out.println("disp Out");
}

static void dispOutS(){


System.out.println("disp Out Static");
}

 static class Inner{
 
 
 int x = 100;
 //static int y = 200;
 
	 void disInn(){
 
	dispOutS();		 
 	
	System.out.println("disp Inn"+y);
 	
 }


 static void disInnS(){
 
 
	System.out.println("disp inn Static "+Outer.y);
	//System.out.println(x);
	System.out.println(y);
 
 }
 
 
 
 
 
 }

public static void main(String args[]){

	
Outer.Inner objInn = new Outer.Inner();

objInn.disInn();
Inner.disInnS();
}

}
