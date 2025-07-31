
import java.util.concurrent.*;


class MyThread4 implements Runnable{



MyThread4(int taskCount){
	this.taskCount = taskCount;





}

	int taskCount;

	public void run(){
	
	
		System.out.println("Task :- "+taskCount+" started with "+Thread.currentThread().getName());

		work();


		System.out.println("Task :- "+taskCount+" ended with "+Thread.currentThread().getName());
	}


	public void work(){
	
	
	try{
	
	Thread.sleep(2000);
	
	}catch(InterruptedException ie){
	
	
	
	
	
	}
	
	
	}



}


class Client4{

public static void main(String args[])throws InterruptedException{


ExecutorService manager = Executors.newSingleThreadExecutor();


for(int i = 1;i<=5;i++){

MyThread4 mt  = new MyThread4(i);

manager.execute(mt);

}




}

}
