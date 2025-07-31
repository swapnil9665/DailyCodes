import java.util.*;

class Dimond {

public static void main(String args[]){

	Scanner sc  = new Scanner(System.in);
	System.out.println("Enter no. of row:: - ");
	int row = sc.nextInt();
	int col = 0;
	for(int i = 1; i<=row*2-1; i++){
	
	//for space of upper pyramid
	 
	if(i<=row){
	
		for(int j = 1; j<=row-i; j++){
		
			System.out.print("\t");
		
		}
	
	//for space of lower inverted triangle
	}else{
	
	
		for(int j = 1; j<=i-row; j++){
		
		
			System.out.print("\t");
		
		
		}

	}

	
	int num = row;
	// for printing num in upper pyramid num
	
	if(i<=row){
	col = i*2-1;

		for(int j=1; j<=col; j++){
		

			if(j<=col/2+1){
				System.out.print(num+"\t");
				num--;
			
					if(j==col/2+1){
			
							num++;
					}
				}else{
				num++;
				System.out.print(num+"\t");
			
			}


		}

	//for printing num in inverted triangle
	}else{

		col = col-2;

		for(int j = 1; j<=col; j++){
		
				if(j<=col/2+1){
				System.out.print(num+"\t");
				num--;
					if(j==col/2+1){
					num++;
					}
				}else{
			
				num++;
				System.out.print(num+"\t");
				}	
		
		}
	
	
	}



System.out.println();
}


}


}
