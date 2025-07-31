import protectedaccess.*;
class DemoChild extends Demo{

DemoChild(){

System.out.println("DemoChild()");




}


public static void main(String args[]){


DemoChild ch = new DemoChild();
Demo d = new Demo();

System.out.println(ch.x);


}

















}
