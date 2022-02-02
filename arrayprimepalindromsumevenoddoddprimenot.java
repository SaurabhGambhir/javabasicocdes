//waptd find the sum of prime palindrom from user given array and check the sum is even or odd.if the sum is odd check sum is prime or not.
import java.util.Scanner;
class arrayprimepalindromsumevenoddoddprimenot 
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
		}                                                         //-------
		int ppsum=0;
	 for (int i=0;i<=(a.length-1) ;i++ )
		{                                                      
		int j=2;
		while (a[i]>=j)//
		{
			if (a[i]%j==0)//
			{
				break;//
			}
			j++;//
		}
	if (a[i]==j)
	{
           //System.out.println(a[i]+"  Entered  no is prime no  ");
           
		   int x=a[i];
		   int rev=0;
		   int temp=a[i];

		while(a[i]>0)
		{
			int digit=a[i]%10;
		    rev=(rev*10)+digit;
			
			a[i]=a[i]/10;
		}
		
        if (temp==rev)
		{
            System.out.println(x+"  Entered no is a palindrom and prime.");
			ppsum=ppsum+x;
		}
	}
		}

		 System.out.println(ppsum+" is a sum of palindrom and prime nos. in array");
          
		  if (ppsum%2==0)
		  {
			  System.out.println(ppsum+" sum of palindrom and prime nos. in array is EVEN");
		  }

		  else
			  {
				System.out.println(ppsum+" sum of palindrom and prime nos. in array is ODD");		
		int b=2;
		while (ppsum>=b)//5>=5-->true
		{
			if (ppsum%b==0)//5%5==0-->true
			{
				break;//
			}
			b++;//5
		}
		if (ppsum==b)
		{
           System.out.println(ppsum+"  sum no is prime no  ");
		}
		else
			{
				System.out.println(ppsum+" sum no is not prime no  ");
			}
			  }
	}

}