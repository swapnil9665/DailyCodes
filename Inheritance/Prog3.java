class Parent{

Parent(){

this(10);//error :- recursive constructor invocation!!!!


}


Parent(int a){
	
	this();



}


}
