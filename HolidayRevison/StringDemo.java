class StringDemo{


public static void main(String args[]){


String str1 = "Shashi Sir";
System.out.println(str1);
String str2 = new String("Kanha");
String str3 = "Kanha";
System.out.println(str2);


System.out.println(System.identityHashCode(str1));
System.out.println(System.identityHashCode(str2));
System.out.println(System.identityHashCode(str3));

str2 = str2.intern();

System.out.println(System.identityHashCode(str2));
System.out.println(System.identityHashCode(str3));

}












}
