import java.util.*;
class StackDemo{



public static void main(String args[]){



Stack stack = new Stack();


stack.push(10);
stack.push(20);
stack.push(30);
stack.push(40);

System.out.println(stack.size());
System.out.println(stack);


System.out.println(stack.peek());
System.out.println(stack.pop());
System.out.println(stack);


	System.out.println(stack.empty());

	stack.ensureCapacity(17);

	System.out.println(stack.capacity());

	

}



}
