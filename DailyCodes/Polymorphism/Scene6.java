class Scene6{

void fun(int...args){

System.out.println("int...args");
}

void fun(int a){

System.out.println("int");
}



}



class Client6{

public static void main(String args[]){

Scene6 obj = new Scene6();

obj.fun();//call made to best match
obj.fun(10,20,'a');

}

}
