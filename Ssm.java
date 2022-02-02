import java.util.Scanner;
class Ssm 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("enter first no  ");
		int a=sc.nextInt();
                                              //scanner and initialization and declaration
		System.out.print("enter second no  ");
		int b=sc.nextInt();

		System.out.print("enter 1 for addition / enter 2 for substraction/ enter 3 for multipication  ");
		int value=sc.nextInt();

		int result=0;


		switch(value)
		{
			case 1 : result=a+b;
			if(result%2==0)
			{
				System.out.print(result+" sum is even");
			}
            else
			{
				System.out.print(result+"sum is odd");
			}
			break;


			case 2 : result=a-b;
			if(result%2==0)
			{
				System.out.print(result+" substraction is even");
			}
            else
			{
				System.out.print(result+"substraction is odd");
			}
			break;


			case 3 : result=a*b;

			if(result%2==0)
			{
				System.out.print(result+" multiplication  is even");
			}
            else
			{
				System.out.print(result+" multiplication is odd");
			}
			break;

			default: System.out.print(" Entered wrong value");


		  }
		}
}