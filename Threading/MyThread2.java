/*1. Daemon thread has least priority 
2. They are helper thread / background thread 
3. They jvm exits when all user thread finished
4. it don's care wether daemon thread finished the exectution or not!*/


class MyThread2 extends Thread{


	public void run(){
	
	try{
	for(int i = 1;i<=10;i--){
		System.out.println(getName());
		Thread.sleep(500);
	}
	}catch(InterruptedException e){
	}
	



	}

}

class Client2{
	public static void main(String args[])throws InterruptedException{
	
	MyThread2 mt = new MyThread2();

		mt.setDaemon(true);
	
	
	
	mt.start();

		for(int i = 1;i<=10;i++){	
		System.out.println(Thread.currentThread().getName()+"  i  = "+i);
		Thread.sleep(2000);
		//if(i ==5){

		//System.out.println("in if");
		//mt.setDaemon(true);
		
	//	}
		}
	}


}
