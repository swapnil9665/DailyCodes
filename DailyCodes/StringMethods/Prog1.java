void main(){

String str1 = "Amit";
String str2 = "Rekha";

System.out.println(str1.concat(str2));
//AmitRekha

System.out.println(str1.charAt(0));
//A

System.out.println(str1.indexOf("i"));
//2
System.out.println(str1.indexOf("z"));
//-1

System.out.println(str1.toLowerCase());
//amit

System.out.println(str1.toUpperCase());
//AMIT

System.out.println(str1.compareTo("amit"));
//-32

System.out.println(str1.compareToIgnoreCase("amit"));
//0

System.out.println(str1.equals("Amit"));
//true
System.out.println(str1.substring(1,3));


}
