class Ujwal{

public static void main(String args[]){

	int arr[] = {5,9,2,6,8,9,10,12};
	int len = arr.length;

	for(int i = 0; i<len;i++){
	
		if(arr[i]>=arr[i+1])
		{
			System.out.println(arr[i+1]);
		}
	
	}

	System.out.println("min value :- "+arr[0]);
	//System.out.println("max value :- "+arr[arr.length-1]);

}



}
