//waptd count the even and odd no from user given range if count is even check is perfect or not if count is odd check it is prime and neon.
//waptd count the even and odd no from user given array if count is even check is perfect or not if count is odd check it is prime and neon
import java.util.Scanner;
class EvenoddRangeCountEvenPerfectornotOddprimeneon
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
       
	   System.out.print("Enter first no  ");
	   int start=sc.nextInt();

	    System.out.print("Enter first no  ");
	   int end=sc.nextInt();
	   int ecount=0;
	   int ocount=0;
for (int i=start;i<=end ;i++)
{   
	   if (evenodd(i))
	   {
		   ecount++;
           // System.out.print(i+"even");
	   }
        
	   else
	   {
		   ocount++;
		//System.out.print(i+"odd");
	   }
}

if (evenodd(ecount))
{
	if (perfect(ecount))
	{
       System.out.println("count of even no from user given range is even and perfect. ");
	}
	else
	{
       System.out.println("count of even no from user given range is even and  not perfect. ");
	}
}
else
	{
	    if (prime(ecount)&&neon(ecount))
	    {
           System.out.println("count of even no from user given range is prime and neon ");
	    }
		else
		{
			System.out.println("count of even no from user given range is not prime and neon ");
		}
	  
	}
//

if (evenodd(ocount))
{
	if (perfect(ocount))
	{
       System.out.println("count of odd no from user given range is even and perfect. ");
	}
	else
	{
       System.out.println("count of odd no from user given range is even and  not perfect. ");
	}
}
else
	{
	    if (prime(ocount)&&neon(ocount))
	    {
           System.out.println("count of odd no from user given range is prime and neon ");
	    }
		else
		{
			System.out.println("count of odd no from user given range is not prime and neon ");
		}
	  
	}

	}

	public static boolean evenodd(int i)
	{
		if (i%2==0)
		return true;
		else 
		return false;
	}

	public static boolean perfect(int num)
	{
		long sum=0;
		for (int i=1;i<num ;i++ )
		{
			if (num%i==0)
			{
                 //System.out.print(i+"  ");	
				 
				  sum=sum+i;
			}

		}
		if (sum==num)
			return true;
		else
			return false;
		
	}

	 public static boolean prime(int num)
     {
            int x=2;

			while (num>=x)//3>=2--->true
			{
		
			   if (num%x==0)//
			  {
				break;//
			  }
			    x++;
		    }

           if (num==x)
			{
                return true;
			}

		   else
			{
			    return false;
			}
	}

	public static boolean neon(int i)
	{
		int sum=0;
		int squ=i*i;


		while(squ>0)//1

		{
			int digit=squ%10;//1%10=1
			//System.out.print(digit+"  ");//4  3  2 1  
            
			 sum=sum+digit;
			squ=squ/10;//12/10=1

		}

		if (sum==i)
		return true;
		else
		return false;
	}
}
