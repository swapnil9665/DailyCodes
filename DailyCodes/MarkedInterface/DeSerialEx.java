import java.io.*;


class DeSerialEx{

public static void main(String args[]){

try{
	FileInputStream fis = new FileInputStream("stud.ser");

	ObjectInputStream ois = new ObjectInputStream(fis);

	Student s1 = (Student) ois.readObject();
	ois.close();
	if(s1 != null){
	
	System.out.println("Name = "+s1.name);
	System.out.println("Roll = "+s1.roll);
	System.out.println(s1);
	
	}else{
	
	System.out.println("failed to deserialize!!");
	}

}catch(Exception e ){

System.out.println("exception!!");

}


}





}
