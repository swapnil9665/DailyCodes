class Parent{
private int x  = 10;
void display(){

System.out.println("x = "+x);

}

}


class Child extends Parent{

//int x = 20;



}

class Client{

public static void main(String args[]){


	Child ch = new Child();
	ch.display();

}
}
