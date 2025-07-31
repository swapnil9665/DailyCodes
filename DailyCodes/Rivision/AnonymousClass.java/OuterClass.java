interface Functional{

void ab1();

}


class Outer{


int x = 10;
static int y = 20;
void display(){

System.out.println("display outer!!!");

}


public static void main(String args[]){


Outer obj1 = new Outer(){


void display(){

System.out.println("display inner");
}



};



Functional f1 = new Functional(){

public void ab1(){

System.out.println("overriden method");

}


};

f1.ab1();



obj1.display();


}







}








