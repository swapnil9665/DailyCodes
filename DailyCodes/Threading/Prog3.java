class MyThread extends Thread{


	public void run(){
	
	while(true){
	
		System.out.println(getName());
	


		try{

		Thread.sleep(1000);
		}catch(InterruptedException e){
		
		System.out.println("in catch!");
		e.printStackTrace();
		System.out.println(e.getMessage());
		System.out.println(e.toString());

		}

	
	
	
	
	
	
	}
	
	
	}



}


class Client3{

public static void main(String args[]) throws InterruptedException{


	MyThread mt = new MyThread();

	
	
	mt.start();


	Thread.currentThread().sleep(5000);

	mt.interrupt();


}

}
