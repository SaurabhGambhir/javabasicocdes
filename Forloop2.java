import java.util.Scanner;
class Forloop2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		
		System.out.print("Input the first number: ");
		
		int x=sc.nextInt();
		
		System.out.print("Input the second number: ");
		
		int y=sc.nextInt();
		
		System.out.print(" even nos. between first no. to second no. are  ");
		
		for (int a=x; a<=y; a++ )
		{
			if (a%2==0)
			{
               System.out.print(a+"  ");
			}

			
		}
		
	}
}
