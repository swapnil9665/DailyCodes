// Multi Threading Trial and Error



class MyThread extends Thread{


	public void run(){
	
	System.out.println("in thread  class run!");
	
	}
	
	public void start(){
	super.start();
	
	System.out.println("in thread class start!");
	
	}

}



class Client{

public static void main(String args[]){

	
	Runnable r1 = ()->
	System.out.println("in anonoymous class!");




	Thread t1 = new Thread(r1);

	t1.start();


	MyThread mt = new MyThread();
	mt.start();

}


}
