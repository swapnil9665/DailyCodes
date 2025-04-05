import java.util.*;
class Switch9{
public static void main(String args[]){

int maths,eng,hindi,mar,sst;

Scanner sc= new Scanner(System.in);
System.out.println("enter marks obtain in maths::- ");

maths = sc.nextInt();

System.out.println("enter marks obtain in eng::- ");

eng = sc.nextInt();

System.out.println("enter marks obtain in hindi::- ");

hindi = sc.nextInt();

System.out.println("enter marks obtain in mar::- ");

mar = sc.nextInt();

System.out.println("enter marks obtain in sst::- ");

sst = sc.nextInt();

if(eng>=35 && maths >= 35 && mar >=35 && sst >= 35 && hindi >=35){

	int total = eng + mar + hindi + sst + maths;
	float percent = (total/500)*100;
	if( percent >= 85 && percent <= 100){
	
		System.out.println("first class");
	}else if( percent >= 75 && percent <= 84){
		System.out.println("second class");
         
	}else{
	
	System.out.println("third class");
	}

}else{
System.out.println("Failed in exam !!");
}



}

}
