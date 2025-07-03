class Scene2{

//call to perfect match is made

//upgrade is done if perfect match is not found byte - short - int - long - float - double     char - int - long ...
void fun(float x,int y){


System.out.println("float int ");
}

void fun(int x, float y){

System.out.println("int float ");

}

}

class Client2{
public static void main(String[] args){
Scene2 obj = new Scene2();

obj.fun(12,33);//error
obj.fun(12,33);//error
//obj.fun(10l); // long is upgraded to float
//obj.fun();


}}
