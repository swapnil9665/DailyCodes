class StringDemo{


public static void main(String args[]){


String str1 = "I am String";
String str2 = new String("I am String");
String str3 = "I am String";
String str4 = new String("I am String");



System.out.println("HashCode::- ");
System.out.println("str1 :-    "+System.identityHashCode(str1));
System.out.println("str2 :-    "+System.identityHashCode(str2));
System.out.println("str3 :-    "+System.identityHashCode(str3));
System.out.println("str4 :-    "+System.identityHashCode(str4));
}
}
