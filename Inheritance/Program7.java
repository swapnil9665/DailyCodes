class BMW{

int year;
String country;

BMW(int year,String country){
	this.year = year;
	this.country = country;
System.out.println("BMW Constructor!!");

}

void displayBmw(){
System.out.println("year : "+year);
System.out.println("country: "+country);

}


}


class Series7 extends BMW{

String model;
Series7(String model,int year,String country){
	super(year,country);

	this.model = model;
System.out.println("Series7 Constructor!!");
}

void displaySer(){

	displayBmw();
System.out.println("model no. : - "+model);
}


}

class Client {

public static void main(String args[]){

//	BMW bmw = new BMW();
//	bmw.displayBmw();

	Series7 s1 = new Series7("709e",1908,"Germany");
	s1.displaySer();



}

}
