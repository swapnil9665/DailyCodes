import java.io.*;

class Demo1{

	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));




public static void main(String args[]) throws IOException{


	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String name = br.readLine();

	System.out.println("name:- "+name);

	
	System.out.println("eter wing:- ");
	char ch = (char)br.read();
	


	System.out.println("Wing:- "+ch);

	System.out.println("Enter building name:- "+ch);

	String buildName = br.readLine();

	System.out.println("building name :- "+buildName);
	System.out.println("Enter id:- ");
	
	int a = Integer.parseInt(br.readLine());


	
	System.out.println("id :- "+a);
	
	//System.out.println("Enter location:- ");

	//System.out.println("location: -"+str2);

}






}
