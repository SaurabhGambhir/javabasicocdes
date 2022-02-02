//waptd count the prime no from given array and check the count is prime or not by using methods.
import java.util.Scanner;
class methodarrayprimecountprimenot 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int a[]=new int [size];
		for (int i=0; i<size; i++ )
		{
			System.out.print("Enter the value in "+i+"index: ");
			a[i]=sc.nextInt();
		}                                            
	      int count=0;
         for (int start=0;start<a.length ;start++ )
         {
         
          
                 
		    // boolean result =prime(start);// instade of storing output of prime method
		                                   //in another variable we will put prime(count) in if condition.
			
			 if (prime(a[start]))           
			 {
				 count++;
				  System.out.println(a[start]);
			 }
		 }

		  System.out.println("count of prime no is"+count);

		 //boolean result2 = prime(count);// instade of storing output of prime method
		                                   //in another variable we will put prime(count) in if condition.

		 if(prime(count))
		{
			 System.out.println("count of prime no is prime");	
		}
		else
		{
			System.out.println("count of prime no is not prime");
		}

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



}
