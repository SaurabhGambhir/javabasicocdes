//waptd count the prime no from user given range and check the count is prime or not
import java.util.Scanner;
class Primenorangecountprimenot
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println(" Enter First no  ");
		int start=sc.nextInt();

		System.out.println(" Enter Second  no  ");
		int stop=sc.nextInt();

		int pcount=0;
		int x=2;
               
		while (start<=stop)
		{

            int i=2;

			while (start>=i)
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
			   pcount++;
           }
		    start++;

        }

		System.out.println(pcount+" is count of prime numbers in given range ");

		while (pcount>=x)//5>=5-->true
		{
			if (pcount%x==0)//5%5==0-->true
			{
				break;//
			}
			x++;//5

		}
		if (pcount==x)
		{
           System.out.println(pcount+" count of prime no in user given range is prime no  ");
		}

		else
			{
				System.out.println(pcount+" count of prime no in user given range is not prime no  ");
			}

	}

}
