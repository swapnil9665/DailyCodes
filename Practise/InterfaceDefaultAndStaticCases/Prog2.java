interface A2{


 void show(){

System.out.println("A interface version of show");

}

}


interface B2{


default void show(){


System.out.println("B interface version of show");


};




}
class Demo2 implements  A2,B2{


	//public void show(){System.out.println("Show overriden in Demo2");}

}

class Client2{


public static void main(String args[]){



Demo2 d = new Demo2();
d.show();

}


}
