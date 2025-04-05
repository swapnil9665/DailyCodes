import java.util.*;

 class Prog1{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("Enter row ");
int row = sc.nextInt();


for(int i = 1;i<=row;i++){

	for (int j = 1;j<=i;j++){
	
	System.out.print("*\t");
	
	}
	System.out.println("");


}

System.out.println("\n\n");


for(int i = 1;i<=row; i++){

	for(int j = 1; j<=row-i+1 ;j++){
	
	System.out.print("*\t");
	
	}
	System.out.println("");


}

System.out.println("\n\n");
for(int i = 1;i<=row;i++){

	for(int j=1;j<=row;j++){

		if(j<=row-i){
		
		System.out.print("\t");
		}else{
		
		System.out.print("*\t");
		
		}

//	System.out.println("");
	}
	System.out.println("");
}


System.out.println("\n\n");

for(int i =1;i<=row;i++){

	for(int j = 1;j<=row;j++){
	
		if(j<=i-1){
		System.out.print("\t");
		}		
		else{
		
		System.out.print("*\t");
		}

	
	}
	System.out.println("");

}





}


}
