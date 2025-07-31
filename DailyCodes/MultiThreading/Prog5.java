
import java.util.concurrent.*;


class MyThread5 extends Thread{



MyThread5(int taskCount){
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


class Client5{

public static void main(String args[])throws InterruptedException{


ScheduledExecutorService manager = Executors.newScheduledThreadPool(3);


for(int i = 1;i<=5;i++){

MyThread5 mt  = new MyThread5(i);

manager.schedule(mt,5,TimeUnit.SECONDS);

}




}

}
