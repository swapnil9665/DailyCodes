



class Demo5{

static void fun()throws InterruptedException{


	System.out.println("start");
	
	Thread.sleep(2000);
	System.out.println("end");

}

static void run() throws InterruptedException{


	System.out.println("start run");
	
	fun();
	System.out.println("end run");
	


}




public static void main(String args[]) throws InterruptedException{


	run();


}




}
