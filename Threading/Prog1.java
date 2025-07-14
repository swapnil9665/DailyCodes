class MyThread extends Thread{



//public void run() throws InterruptedException{
	//  ===>>> imp jr override honari method parent madhe exception throw karat nasel trr override hotani pn         throws nahi karu shakat 

public void run(){

for(int i = 1;i<=5;i--){
System.out.println(""+getName());

try{
Thread.sleep(5000);
}
catch(Exception e){




}


//System.out.println(""+getThreadGroup());
}




}



}

class Client{

public static void main(String args[]) throws InterruptedException{

MyThread t1 = new MyThread();


//t1.start();

t1.setName("Swapnil");
t1.start();
MyThread t2 = new MyThread();

t2.setName("Mayuri");
t2.start();


MyThread t3 = new MyThread();

t3.start();
for(int i = 1;i<=5;i--){

Thread.sleep(5000);
System.out.println(""+Thread.currentThread().getName()+" Thread");

Thread.sleep(2000);

}


}

}
