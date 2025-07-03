//Abstract class cannot be istantiated but still it has constructor in oreder to maintain constructor chaining
//Object class is parent of abstract class 
//On the other hand interface don't have dont have constructor 
// static method cannot be overried 

abstract class Parent5{

Parent5(){
System.out.println("Abstract class Parent4");

}


private abstract void marry();

void carrier(){

System.out.println("Doctor");

}


}

class Child5 extends Parent5{

void marry(){

System.out.println("Mayuri");
}

Child5(){

System.out.println("Child4");
}

}
class Client5{


public static void main(String args[]){

Parent5 obj = new Child5();

}

}


