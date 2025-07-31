

//1. if any method in calss dont have body or {} braces then the method should be given body or declared to be abstract
//2. if any class contains one or more abstract method then the class must be declared as abs
//3. if a child class extends abstract class then it must provide implementation to parent's abstract method otherwise the child should be declared as abstract
//4. 	

abstract class Payment1{

void amount(){
System.out.println("1000");

}

abstract void makePayment();



}
class PayPal1 extends Payment1{

void makePayment(){

System.out.println("Paypal");
}


}
class Client1{


public static void main(String args[]){

Payment1 p = new PayPal1();

PayPal1 pp  = new PayPal1();

p.makePayment();
pp.makePayment();


}



}
