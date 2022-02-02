//find the sum of digits from the user given value and 
//check the sum is even or odd if it is odd check it is divisible of 3 or not
import java.util.Scanner;
class Checksumevenodd 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter first no  ");
		int a=sc.nextInt();//5679

		int sum=0;
         
		 while(a>0)
		{
		  int digit	=a%10;
		  System.out.println(digit);//9 7 6 5 

		  a=a/10;

		  sum=sum+digit;//27
        }
		System.out.println(sum);//27
		if (sum%2==0)
		{
             System.out.println(sum+"sum is even");
		}
		else
		{
			System.out.println(sum+"sum is odd");

			if (sum%3==0)
			{
				System.out.println(sum+"sum is divisible by 3");
			}

			else
				{
				
                System.out.println(sum+"sum is not divisible by 3");
			}

		}
	}
}





