import java.util.*;
import java.io.*;
class Demo
{
	public static void main(String arg[])
	{
	int a ,b,choice;
	float res;
	do
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter  a,b");
	a=scan.nextInt();
	b=scan.nextInt();
	System.out.println("1.sum\n 2.sub \n 3.mul 4.dev \n 5.mod");
	choice=scan.nextInt();
	switch(choice)
	{
	case 1:res=a+b;
		  System.out.println("sum="+res);
	      break;
	case 2:res=a-b;
		  System.out.println("sub="+res);
	      break;
	case 3:res=a*b;
		  System.out.println("mul="+res);
		  break;
	case 4:res=(float)a/b;
		  System.out.println("dev="+res);
	      break;
	case 5:res=a%b;
		  System.out.println("mod="+res);
		  break;
	default:
		  System.out.println("invalid=");
		  break;
	}
	}
	while(choice!=6);
	}
}
	
	
	
	
	
	
	