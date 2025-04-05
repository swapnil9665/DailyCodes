class Bitwise{

public static void main(String args[])
{
int a=7;//00000111
int b=8;//00001000
	//00000000 0
	//00001111 15
	//00001111
	//11111000
	//
	//
	//00000101
	//11111010
	//11111011

System.out.println(a&b);
System.out.println(a|b);
System.out.println(a^b);
System.out.println(~5);
//111111111111111111111111 1111 1010
//000000000000000000000000 0000 0101
System.out.println(0b11111111111111111111111111111011);



}

}
