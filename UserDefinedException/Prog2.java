class MyException2 extends RuntimeException{

MyException2(String str){

	super(str);

}

}

class Client2{



public static void main(String args[]){

System.out.println("Start code");

MyException2 myExp = new MyException2("hello exp");
try{	
//MyException myExp = new MyException();


throw myExp;

}
//catch(MyException2 e){

//System.out.println("Runtime catch block");

//System.out.println(10/0);
//}

catch(ArithmeticException e){


System.out.println("Myexp catch block");

}




System.out.println("End code");


}




}
