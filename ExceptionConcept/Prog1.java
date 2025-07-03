import java.io.*;

class Demo{

public static void main(String args[]) throws IOException{

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


System.out.println("Enter name");
String str = br.readLine();

System.out.println("name :- "+str);
br.close();

String location = br.readLine();

System.out.println(str);







}


}
