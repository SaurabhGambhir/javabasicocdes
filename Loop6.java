import java.util.Scanner;
class Loop6 
{
	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
	
	    System.out.println("first no is ");
	    int i=sc.nextInt();

	    System.out.println("second no is ");
	    int j=sc.nextInt();
		
		int a=i;
		
		System.out.print("no divisible by 3 from first no. to second no are");
		
		while (a<=j)
		{
			if (a%3==0)
			{
				System.out.print(a+"  ");
				
			}

			a++;
		}

		
	}
}
