class Parent{
//Parent p = new Parent();	
int x = 30;
static int y = 32;

Parent(){

System.out.println("Parent Constructor");

}
void display(){

System.out.println("display()-Parent");



}






}

class Client{

//Parent ref = new Parent();
public static void main(String args[]){

Parent p = new Parent(){

void display(){

System.out.println("display()-Parent Overiden in anonymous Client$1 extends Parent");

System.out.println(x+" =x y="+y);


}

};
p.display();

}


}
