class Scene0{

void fun(int a){

	System.out.println("int");

}

void fun(int a , int b){

	System.out.println("int int ");
}







}
class Client0{

public static void main(String args[]){

Scene0 obj = new Scene0();

obj.fun(1);
obj.fun(1,3);
obj.fun('C');

}



}
