interface Walkable{
public void walk();


}


class Lion implements Walkable{


public void walk(){

System.out.println("LionWalk");


}
void hair(){

System.out.println("long hair");
}

}

class Client2{


public static void main(String args[]){

Walkable msd  = new Lion();
msd.walk();
msd.hair();
}

}
