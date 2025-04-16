//import java.javafx.application.*;

class Demo{

Demo(){

System.out.println("Demo Constructor!!");
//display();
}


void display(){
	this();
	System.out.println("display()");
}

public static void main(String args[]){



Demo obj = new Demo();
}



}



class Client{

Client(){
super();
System.out.println("Client Constructor!!");
}

public static void main(String args[]){


Demo d = new Demo();


Client obj = new Client();
}}
