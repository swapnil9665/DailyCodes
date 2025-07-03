import java.io.*;



class UserInput3{

public static void main(String args[]) throws IOException{

	InputStreamReader isr = new InputStreamReader(System.in);
	


	BufferedReader br = new BufferedReader(isr);
	
	 System.out.println("Enter input2::- ");
        int ch = isr.read();
	
	System.out.println("Enter input1::- ");

	int str = br.read();

	

	System.out.println("input 1 "+str);

	System.out.println("input 2 "+ch);


}

}
