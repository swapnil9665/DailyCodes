//Abstract class cannot be istantiated but still it has constructor in oreder to maintain constructor chaining
//Object class is parent of abstract class 
//On the other hand interface don't have dont have constructor 


abstract class Parent4{

Parent4(){
System.out.println("Abstract class Parent4");

}


abstract void marry();

void carrier(){

System.out.println("Doctor");

}


}

class Child4 extends Parent4{

void marry(){

System.out.println("Mayuri");
}

Child4(){

System.out.println("Child4");
}

}
class Client4{


public static void main(String args[]){

Parent4 obj = new Child4();

}

}


