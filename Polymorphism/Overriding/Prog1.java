// for overriding rules
//  1 two calss parent child
//  2 method with same signatuer in both class
//  3. return type should be same 
//  3.1 if return type is primitiver then there should be exact match
//  3.2 if the return type is class type then the return type should be exact match or
//  IT can be Co-Variant Parent - Child
//  3.2.1  the method to be overiden return type can be Parent of return type of overriding method in child class's method 
//  3.2.2 this can not be altered or vice versa 
//  4 private method don's participate in method overriding as they are not visible outside own class
//  5 if we made a method as final then we can't override them but we can still access them this is different from above point // as private is not visible or accessible in any other 
//  6 if method is static in parent and we try to override it as instance method in child then there is error 
//  7 if method with same signatuer in parent and child are static then the method in parent is hidder 
//  this concept is called as method hidding
// 8. While Overriding Parent's method in child class we should not down or decrease the access privilages we can increase it hovever




class Parent{

 void marry(){

	System.out.println("XYZ");
}

void carrier(){

	System.out.println("Engineer");	
}
}

class Child extends Parent{


  void marry(){
	
	System.out.println("Mayuri");
	
	};

}

class Client{

public static void main(String args[]){

	Parent p = new Parent();
	Child c = new Child();
	Parent pc = new Child();

	p.marry();
	c.marry();
	pc.marry();



}

}


