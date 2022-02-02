// waptd find the sum of prime no and check the sum is palindrom or not.
import java.util.Scanner;
class Primenorangesumpalindromnot
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println(" Enter First no  ");
		int start=sc.nextInt();//

		System.out.println(" Enter Second  no  ");
		int stop=sc.nextInt();//
               
		int sum=0;

		while (start<=stop)
		{

            int i=2;
			

			while (start>=i)//
			{
		
			   if (start%i==0)//
			  {
				break;//
			  }
			
			    i++;//

		    }

		
           if (start==i)
           {
			   System.out.println(start+" is prime number ");

			   sum=sum+start;
           }
		    start++;

        }

		System.out.println(sum+" This is sum of prime numbers in given range ");

        int x=2;

		while (sum>=x)
		{
			if (sum%x==0)
			{
				break;
			}
			x++;

		}
		if (sum==x)
		{
           System.out.println(sum+" This sum of prime nos. is prime no.  ");
		}

		else
			{
				System.out.println(sum+" This sum of prime nos. is not prime no.  ");
			}


	}



}
