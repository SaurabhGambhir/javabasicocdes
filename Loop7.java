import java.util.Scanner;
class Loop7
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("first no is  ");
		int a=sc.nextInt();
		int x=a;

		System.out.println("second no is  ");
		int b=sc.nextInt();
		int y=b;
		
		
		
		int i=a;
		int sum=0;
		while (i<=b)
		
		{
			sum=sum+i;
			i++;

		}
		if (sum%2==0)
		{
		 System.out.println("the sum of no from "+x+" to "+y+" is "+sum+" and it is even");
		}
		else
		{
		   System.out.println("the sum of no from "+x+" to "+y+" is "+sum+" and it is odd");
		}
	}
}
