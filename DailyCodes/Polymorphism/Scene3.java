class Scene3{

void fun(String str){

	System.out.println("String");

}

void fun(StringBuffer sb){

	System.out.println("StringBuffer");
}







}
class Client3{

public static void main(String args[]){

Scene3 obj = new Scene3();

obj.fun("ShashiSir");
obj.fun(new StringBuffer("ShashiSir"));
obj.fun(new String("Shashi"));
obj.fun(null);//ambiguity will occur erro reference to fun is ambigous.

}



}
