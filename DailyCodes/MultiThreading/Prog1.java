
// join method ::- 
// it forced current thread to stop it's execution until the thread on which the join method is called completes it's execution...


class MyThread implements Runnable{
	public void run(){
	
	System.out.println( "In "+Thread.currentThread().getName()+" run()");
		
		try{
		
			Thread.sleep(5000);
		
		}catch(InterruptedException ie){
		
		
		}	
	
	}







}

class Client{

public static void main(String args[])throws InterruptedException{

	MyThread mt1 = new MyThread();

	Thread t1 = new Thread(mt1);

	Thread t2 = new Thread( new Runnable(){
	public void run(){

	System.out.println( "In "+Thread.currentThread().getName());
	}

	});





	t1.start();
	t1.join();
	t2.start();


}

}


