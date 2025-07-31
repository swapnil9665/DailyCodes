//   1. lambda function only works with functional interface
//   2. it prevents from overhead of creation of that $1.class file which remains as trash beacuse there is no need of it as annonymous class is only used once and can't be instantiat later   

interface Fruit{
String pet = "King";
 void juice();
static void color(){

}

}

class Mango{


public static void main(String args[]){


Fruit f1 = new Fruit(){

public void juice(){

System.out.println("overriden1  :- "+Fruit.pet);

}
};

Fruit f2 = ()->{


System.out.println("overriden2  :- "+Fruit.pet);

};


f1.juice();
f2.juice();
}





}



