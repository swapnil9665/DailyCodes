
import java.io.*;

class Student implements Serializable{

int roll;
String name;

Student(int roll,String name){
	this(roll);

	this.name = name;
	System.out.println("const(1,2)");




}


public String toString(){

return("{ Name:"+this.name+"Roll:"+this.roll+" }");

}

Student(int roll){

	this.roll = roll;
	System.out.println("const(1)");

}

Student(){


}


}

class SerialEx{
	public static void main(String args[]) throws IOException{
		Student s1 = new Student(7,"Mahiya");

		FileOutputStream fos = new FileOutputStream("stud.ser");
		ObjectOutputStream oop = new ObjectOutputStream(fos);

		oop.writeObject(s1);

		System.out.println("Serialization done!!!!");
		oop.close();
	}
}
