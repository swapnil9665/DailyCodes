import java.util.*;
import java.io.*;
class Pattern2{
	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no. of rows::- ");
		int row = Integer.parseInt(br.readLine());
		
		System.out.println("Enter string::- ");
		String str = br.readLine();
		
		for(int i = 1; i <= row; i++){
		
			for(int j = 1; j <= row; j++){
			
				System.out.print(str+"\t");

			
			}
			System.out.println();
		
		}
	
	}



}
