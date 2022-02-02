//waptd print all the strong no from user given range
import java.util.Scanner;//strong means seprate the no and find factorial of each no add the factorials 
class  strongno2          //compare the addition of factorials with given no if it is equal then no is strong.
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("enter first no  ");
		int a=sc.nextInt();

		System.out.print("enter first no  ");
		int b=sc.nextInt();
  
          System.out.println("this are strong no in given range");

         

		for (int i=a;i<=b ;i++ )
		{
			boolean res1=strong(i);
			if (res1)
			{
				System.out.println(i);
			}
			
		}
		
	}
	public static boolean strong (int a)
	{
		int temp=a;
		int sum=0;
		int num=0;

	while(a>0)
		{
		    int dig=a%10;
           // int fact=factorial(dig);
		   int fact=1;
		 for (int i=1;i<=dig ;i++ )
		 {
			fact=fact*i;//24=24*1
		 }
			sum+=fact;
			a=a/10;
		}

		if (sum==temp)
		return true;
		else
		return false;
	}
	/*public static int factorial(int num) 
	{
		

		int fact=1;

		while (num>=1)
		{
			fact=fact*num;//24=24*1
			num--;//1
		}

		return fact;

		//System.out.println(fact+" This is the factorial of given number ");
	}*/
}
