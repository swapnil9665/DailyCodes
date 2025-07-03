class Company{

String cmpName = "Microsoft";
String cmpLoc = "Chh. Sambhajinagar";

Company(String str){


	System.out.println("In Company Constructor");

}

void cmpInfo(){

System.out.println("Company Name:- "+this.cmpName);
System.out.println("Company Location:- "+this.cmpLoc);


}



}

class Client{

void Client(){
	
	System.out.println("Company Name:- ");	
//	Company.cmpInfo(); again non-static method cmpInfo() cannot be referenced from static context.
	}

public static void main(String args[]){
//	Company.cmpInfo(); non-static method cmpInfo() cannot be referenced from static context.
//	cmpInfo(); can not find symbol.
	
Company cmp = new Company(10);// error : int cannot be converted to String

Company cmp1 = new Company(10,10);//error : required found reason actucal and formal argument list differ in length


}


}


