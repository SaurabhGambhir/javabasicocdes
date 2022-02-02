import java.util.*;
class Swap 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("enter first no  ");
		int a=sc.nextInt();

		System.out.print("enter second no  ");
		int b=sc.nextInt();
        
       System.out.println("Before Swaping "+a+" is first no and "+b+" is second no ");

		int temp=0;

		temp=a;
		a=b;
		b=temp;

		System.out.println("Now "+a+" is first no and "+b+" is second no ");
	}
}