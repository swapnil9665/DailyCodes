
class Animal{

    int x = 10;
    void display(){

        System.out.println("A "+x);
    
    }
}

class Monkey extends Animal{

int x = 20;

void display(){

    System.out.println("M "+x);

}
}




 class Program1 {

    
    void display(Animal a){
        System.out.println("Animal Version "+a.x);
    }

    void display(Monkey m){
        System.out.println("Monkey Version"+m.x);
    }
    public static void main(String[] args) {
        Animal a = new Animal();
        Monkey m = new Monkey();
        Animal m2 = new Monkey();
String str [] = new String[]{};

System.out.println(str[0]);
        a.display();//10
        m.display();//20
        m2.display();//20
        

        Program1 p = new Program1();
        p.display(a);//10
        p.display(m);//20
        p.display(m2);//animal version 20




    }
    
}
