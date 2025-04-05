import java.io.*;

class Prog2{

public static void main(String args[]) throws IOException{
BufferedReader br  = new BufferedReader( new InputStreamReader(System.in));

System.out.println("Enter size of Array :- ");

int[] arr;
int size = Integer.parseInt(br.readLine());
 
arr = new int[size];
System.out.println("Enter Data :");
for(int i = 0;i<size;i++){

	arr[i] = Integer.parseInt(br.readLine());

}

System.out.println("Array : ");

for(int i = 0; i<size;i++){

	System.out.println(arr[i]);

}



}


}
