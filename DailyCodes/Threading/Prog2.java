class MyThread2 extends Thread{


	public void run(){
	
	
	System.out.println("In runn of MyThread2");
	
	}


	public void start(){
	
	
	
	System.out.println("In start of MyThread2");
	
	}

}

class Client22{




public static void main(String args[]){



	System.out.println("In main");
	MyThread2 t1 = new MyThread2();

		
	t1.start();


		//IMP ==>>   IF WE START SAME THREAD TWO TIME OR CALL START METHOD TWO TIME FOR SAME THREAD THEN IT THROWS ILLIGLLE THREAD STATE EXCEPTION
	//t1.start();

	System.out.println("end main");
}




}


