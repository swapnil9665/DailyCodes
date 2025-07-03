
class Demo{

int x = 10;

void fun(){

System.out.println("x = "+this.x);


}



}



class Client{


public static void main(String args[]){

//	System.out.println(10/0);
	Demo obj1 = new Demo();

	System.out.println("in main  x = "+obj1.x);

	obj1.fun();


	obj1 = null;


	obj1.fun();


}



}
