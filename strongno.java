//waptd user entered no is strong no or not 
import java.util.Scanner;//strong means seprate the no and find factorial of each no add the factorials 
class  strongno          //compare the addition of factorials with given no if it is equal then no is strong.
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("enter first no  ");
		int a=sc.nextInt();
		int temp=a;
		int sum=0;

	while(a>0)
		{
		    int dig=a%10;

            int fact=factorial(dig);

			sum+=fact;
			a=a/10;


		}

		if (sum==temp)
		{
           System.out.print(sum+"is strong no");
		}
		else
		{
			System.out.print(temp+"is not strong no");
		}
		
	}

	
	public static int factorial(int num) 
	{
		

		int fact=1;

		while (num>=1)
		{
			fact=fact*num;//24=24*1
			num--;//1
		}

		return fact;

		//System.out.println(fact+" This is the factorial of given number ");
	}
}


