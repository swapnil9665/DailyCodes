import java.util.concurrent.*;


class MyThread2 implements Runnable{

	int threadNo;

	MyThread2(int threadNo){

		this.threadNo = threadNo;
	
	
	}


	public void run(){
	
	
	System.out.println("Task "+threadNo+" starts with"+Thread.currentThread().getName());

	try{
	
	Thread.currentThread().sleep(3000);
	
	
	}catch(InterruptedException e){
	
	
	
	}
	System.out.println("Task "+threadNo+" ends with"+Thread.currentThread().getName());
	
	}	





}


class ThreadPooling{


public static void main(String args[]) throws InterruptedException{

//ExecutorService executor = Executors.newFixedThreadPool(3);
ThreadPoolExecutor executor = (ThreadPoolExecutor)Executors.newFixedThreadPool(3);

for(int i = 1;i<=5;i++){

	MyThread2 mt = new MyThread2(i);
	executor.execute(mt);

}



executor.shutdown();
}



}
