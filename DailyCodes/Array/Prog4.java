import java.io.*;

class Prog4{

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


int i;
int sum = 0;
for( i = 0; i<size;i++){

	sum = sum+arr[i];
}

System.out.println("Sum of array is : "+sum);

}


}
