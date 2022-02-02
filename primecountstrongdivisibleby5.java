//waptd count the prime no from user given range and check the count is strong no or not.if it is strong check the no divisible of 5 or not.
import java.util.Scanner;
class primecountstrongdivisibleby5 
{
	public static void main(String[] args) 
	{
       Scanner sc=new Scanner(System.in);
		System.out.println("Enter first no");
        int a=sc.nextInt();

        System.out.println("Enter last no");
        int b=sc.nextInt();
        
        int pcount=0;

        for (int i=a; i<=b; i++ )
        {
           if(prime(i))
             {
				pcount++;
             }
        }
           
           
        
          if (strong(pcount))
           {
              if(pcount%5==0)
                {
				System.out.println(pcount+ " count of prime no is strong no and divisible by 5  ");	
                }
              else
                {
				System.out.println(pcount+ " count of prime no is strong no and not divisible by 5  ");	
                }    
           }
           else
           {
			System.out.println(pcount+ " count of prime no is not strong no ");	
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



       public static boolean prime(int num)
        {
            int x=2;

			while (num>=x)//3>=2--->true
			{
		
			   if (num%x==0)
			  {
				break;
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
}
