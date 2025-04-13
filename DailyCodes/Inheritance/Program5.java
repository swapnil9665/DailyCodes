class Company{
static int regNo = 10;
Company(){
//super(); bytecode :- invoke special constructor  Object()
//this.cmpName = "Ms";
//this.cmpLoc = "Chh. Sambhajinagar";
System.out.println("In Company Constructor");
}
	
String cmpName = "Microsoft";
String cmpLoc = "Chh. Sambhajinagar";





void cmpInfo(){

System.out.println("Company Name:- "+this.cmpName);
System.out.println("Company Location:- "+this.cmpLoc);


}



}

class Employee extends Company{

String empName = "Shashi";
double empSal = 10.5d;

Employee(){
//super(); bytecode :- invoke special constructor  Company()
//this.empName = "Shashi";
//this.empSal = 10.5d;
System.out.println("In Employee Constructor");
}

void empInfo(){

System.out.println("Employee Name:- "+this.empName);
System.out.println("Company Salary:- "+this.empSal);


}



}


class Client{


public static void main(String args[]){
//	Company.cmpInfo(); non-static method cmpInfo() cannot be referenced from static context.
//	cmpInfo(); can not find symbol.
	


	//obj of Company class
	Company cmp = new Company();

	cmp.cmpInfo();


	//obj of Employee class
	Employee emp = new Employee();
	
	System.out.println("cmpony reg no. :- "+emp.regNo);

	emp.empInfo();
	emp.cmpInfo();


}


}


