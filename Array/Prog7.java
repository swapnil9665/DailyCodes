import java.util.*;

class Prog7{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);


System.out.println("enter array size ::- ");
int row = sc.nextInt();
int col = sc.nextInt();
System.out.println("Enter array data:: ");

int arr[][] = new int[row][col];
int sum = 0;
for(int i = 0; i<row;i++){

	for(int j = 0; j<col;j++)
		{
		
			arr[i][j] = sc.nextInt();
		
		
		}

}


System.out.println("Array Data ::- ");



for(int i = 0; i<row;i++){

        for(int j = 0; j<col;j++)
                {

                        sum += arr[i][j];


                }

}

System.out.println("sum = "+sum);
}


}
