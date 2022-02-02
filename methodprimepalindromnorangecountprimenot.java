//waptd check the user enterd number is primepalindrom or not by using methods.
import java.util.Scanner;
class methodprimepalindromnorangecountprimenot 
{
	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);

		System.out.println(" Enter First no  ");
		int start=sc.nextInt();//3

		System.out.println(" Enter Second  no  ");
		int end=sc.nextInt();//10

		//int count=0;
          while (start<=end)
          {          
		     boolean result =prime(start);// instade of storing output of prime method
		                                   //in another variable we will put prime(count) in if condition.
	         

			 boolean result2=palindrom(start);

			 if (result1 && result2)
			 {
                 System.out.println("prime no is"+start);
			 }
            start++;
		  }
		  //System.out.println("count of prime no is"+count);

		// boolean result2 = palindrom(start);// instade of storing output of prime method
		                                   //in another variable we will put prime(count) in if condition.

		// if(result2)
		//{
		//	 System.out.println("count of prime no is prime");	
		//}
		//else
		//{
		//	System.out.println("count of prime no is not prime");
		//}

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

	public static boolean palindrom(int a )
	{
		int rev=0;
		
		int temp=a;

		

		while(a>0)

		{
			int digit=a%10;
		rev=(rev*10)+digit;//this statment will store the reverse value in rev 
			                   // if we write only sop then it will only print thevalue.
			
			a=a/10;

		}
		System.out.print(rev);
		

        if (temp==rev)
		{
		return true;
		}
		
		else
		{
		return false;
		}
	}

}
