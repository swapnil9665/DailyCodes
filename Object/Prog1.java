class Demo{

	static int x = 10;
	int y = 20;

	static void fun(){
	System.out.println("In fun");
	}

static{

System.out.println("in static block");
}

	public static void main(String args[]){
	
	Demo obj1 = new Demo();	
	System.out.println(x);
	System.out.println(obj1.y);
	fun();
	
	}
static {

System.out.println("in static 2 block");
}


}
