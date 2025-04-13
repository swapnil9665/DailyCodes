import java.util.*;

class Processor{
int cores;
int threads;
int clock_Speed;


Processor(){


}

Processor(int cores,int threads,int clock_Speed){

	this.cores =  cores;
	this.threads = threads;
	this.clock_Speed = clock_Speed;


}

void displayData(){

System.out.println("No. of cores :- "+this.cores);
System.out.println("No. of threads :- "+this.threads);
System.out.println("Clock Speed :- "+this.clock_Speed+" GHz");


}




}


class Client{
public static void main(String args[]){

	//scanner obj creation
	Scanner sc = new Scanner(System.in);

	//taking input from user


	System.out.println("Enter No. of cores :- ");
	int cores = sc.nextInt();

	 System.out.println("Enter No. of threads :- ");
        int threads = sc.nextInt();

	 System.out.println("Enter Clock Speed in GHz :- ");
        int clock_Speed = sc.nextInt();

	
	//obj creation
	
	Processor p1 = new Processor(cores,threads,clock_Speed);


	//displaying data 
	p1.displayData();






}



}
