class Scene1{

//call to perfect match is made

//upgrade is done if perfect match is not found byte - short - int - long - float - double     char - int - long ...
void fun(float x){


System.out.println("float");
}

void fun(int x){

System.out.println("int ");

}

}

class Client1{
public static void main(String[] args){
Scene1 obj = new Scene1();

obj.fun(12);
obj.fun(12.4f);
obj.fun(10l); // long is upgraded to float
obj.fun(3.4f);


}}
