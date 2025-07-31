interface A{


 void show();

}


interface B{


void show();




}
class Demo implements  A,B{


	public void show(){
	
	System.out.println("Show overriden");
	}

}

class Client{


public static void main(String args[]){



Demo d = new Demo();
d.show();

}


}
