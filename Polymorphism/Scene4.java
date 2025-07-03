class Scene4{

void fun(Object obj){

System.out.println("Object");


}

void fun(String str){


System.out.println("String");

}}

class Client4{
public static void main(String args[]){

Scene4 obj = new Scene4();

obj.fun("str");
obj.fun(null);



}




}
