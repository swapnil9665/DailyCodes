
import java.util.*;

class ListDemo{


public static void main(String args[]){


ArrayList<Integer> list = new ArrayList<Integer>();

List list2 = new ArrayList();


list2.add(100);
list2.add(200);
list2.add(300);



list.add(10);

System.out.println(list);
list.addAll(list2);


System.out.println(list);


list.add(-2);
list.add(0,-1);
System.out.println(list);
list.add(2,10);

System.out.println(list);
System.out.println(list.lastIndexOf(10));



System.out.println(list.size());




System.out.println(list.hashCode());
System.out.println(list.contains(-1));
System.out.println(list.size());

list.ensureCapacity(30);



System.out.println(list);

System.out.println(list.size());


list.trimToSize();

System.out.println(list.size());

}





}
