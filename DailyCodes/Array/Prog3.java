import java.io.*;

class Prog3{

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

System.out.println("Enter element to be searched in array : ");
int target = Integer.parseInt(br.readLine());
int i;
boolean present = false;
for( i = 0; i<size;i++){

	if(arr[i] == target){
		present = true;
		break;
	
	}
	

}

if(present){
System.out.println("Element is Present");
}else{
	System.out.println("Not Present");
}



}


}
