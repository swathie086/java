import java.util.*;
import java .io.*;
class Demo
{
	public static void main(String arg[])
	{
		int age;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter age");
		age=scan.nextInt();
		if(age>=18)
		{
		System.out.println("elegible to vote");
		}
		else
		{
		System.out.println("not elegible");
	 }
}
}