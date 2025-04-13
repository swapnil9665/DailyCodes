class Company{

String cmpName = "Microsoft";
String cmpLoc = "Chh. Sambhajinagar";

Company(){


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
	


}


}


