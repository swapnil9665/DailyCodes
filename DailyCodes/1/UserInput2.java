import java.io.*;



class UserInput2{

public static void main(String args[]) throws IOException{

	InputStreamReader isr = new InputStreamReader(System.in);
	//int ch = isr.read();




	
	//System.out.println(ch);


	BufferedReader br = new BufferedReader(isr);
	System.out.println("Enter input1::- ");

	String str = br.readLine();

	System.out.println("Enter input2::- ");
	int ch = isr.read();

	System.out.println("input 1 "+str);

	System.out.println("input 2 "+ch);


}

}
