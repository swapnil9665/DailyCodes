class MyException extends Exception{



}

class Client{



public static void main(String args[]){

System.out.println("Start code");

MyException myExp = new MyException();
try{	
//MyException myExp = new MyException();


throw myExp;

}
catch(MyException e){

System.out.println("Runtime catch block");

System.out.println(10/0);
}

catch(ArithmeticException e){


System.out.println("Myexp catch block");

}




System.out.println("End code");


}




}
