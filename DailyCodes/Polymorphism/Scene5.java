class Scene5{

void fun(StringBuffer sb){

System.out.println("StringBuffer");


}

void fun(String str){


System.out.println("String");

}}

class Client5{
public static void main(String args[]){

Scene5 obj = new Scene5();

obj.fun("str");
obj.fun(null);//error :: - reference to fun() is ambigious. 



}




}
