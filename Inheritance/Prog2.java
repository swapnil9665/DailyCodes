class A{


A(){
	//System.out.println("In A()"); this() must be first statement in constructor
this(10);
System.out.println("In A()");

//super() must be first statement in constructor 
}

A(int a){
System.out.println("In A(10)");
	System.out.println(a);
}

public static void main(String args[]){

Object obj = new A();


}







}
