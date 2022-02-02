// find the fibonacci series for user given number.
import java.util.Scanner;
class Fibonacci
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter no  ");
		int a=sc.nextInt();

		System.out.println("enter no  ");
		int b=sc.nextInt();

		while (a<=b)
		{
			int c=a+b;
            
			System.out.println(c);

			a=b;
			b=c;
		   
		}

	}
}
