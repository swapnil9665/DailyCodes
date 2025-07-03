import java.io.*;

class Demo2{

static void fun(){

System.out.println("start fun");

int x = 10/0;

System.out.println("end fun");


}


static void run(){

System.out.println("start fun");
fun();
System.out.println("end fun");




}

public static void main(String args[]) throws IOException{


Demo.fun();





}


}
