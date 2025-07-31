// 1. Created thread according to need 
// 2. also create previously created thread if they are idle 
// 3. thread idle more than 60 seconds are terminted







import java.util.concurrent.*;

class MyThread3 implements Runnable{

	int threadCount;
	MyThread3(int threadCount){
	
	this.threadCount = threadCount;
	}



	public void work(){
	
	
//	System.out.println("Task "+threadCount+" starts with"+Thread.currentThread().getName());
		try {
		
		Thread.currentThread().sleep(3000);


		}catch(Exception e){
		
		
		
		}
	
	}

	
	public void run(){
	
	
	System.out.println("Task "+threadCount+" starts with"+Thread.currentThread().getName());
	work();	
	System.out.println("Task "+threadCount+" ends with"+Thread.currentThread().getName());
	
	}








}


class Client3{

public static void main(String args[]) throws InterruptedException{


ExecutorService executor  = Executors.newCachedThreadPool();


for(int i = 1;i<= 5; i++){


MyThread3 mt = new MyThread3(i);

executor.execute(mt);


}



System.out.println("waitin");
Thread.sleep(3000);

for(int i = 1;i<=5;i++){

MyThread3 mt = new MyThread3(i);

executor.execute(mt);

}




}

}
