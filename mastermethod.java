//waptd find the sum of user given range and check the no is prime no or not neon no or not perfect no or not strong no or not amstrong no or not. palindrom or not.
import java.util.Scanner;
class mastermethod
{
	public static void main(String[] args) 
	{
        Scanner sc =new Scanner(System.in);
		System.out.println("Enter first no");
        int a=sc.nextInt();

        System.out.println("Enter last no");
        int b=sc.nextInt();
        
         int sum=0;

        for (int i=a; i<=b; i++)
        {
           sum=sum+i;
        }
         if (prime(sum))
           { System.out.println(sum+" is prime no"); }
           else
           {System.out.println(sum+" is not prime no");}
     
          if (neon(sum))
           { System.out.println(sum+" is neon no"); }
           else
           {System.out.println(sum+" is not neon no"); }
  
            if (perfect(sum))
           { System.out.println(sum+" is perfect no"); }
           else
           {System.out.println(sum+" is not perfect no"); }

           if (strong(sum))
           { System.out.println(sum+" is strong no");}
           else
           {System.out.println(sum+" is not strong no"); }

           if (armstrong(sum))
           { System.out.println(sum+" is armstrong no");}
           else
           {System.out.println(sum+" is not armstrong no");}

           if (palindrom(sum))
           {  System.out.println(sum+" is palindrom no");}
           else
           {
			System.out.println(sum+" is not palindrom no");
           }
	}
    
     public static boolean prime(int num)
     {
            int x=2;

			while (num>=x)//
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
    
     public static boolean perfect(int a) 
     {
        int sum=0;
		int temp=a;
      for (int i=1; i<a ; i++)
      {
         if(a%i==0)
          {
			sum+=i;
          }
       }
       if(sum==temp)
         return true;
         else
         return false;  
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

    public static boolean armstrong(int a )
	{   int b=a;
	    int temp=a;
		int sum=0;
		int count=0;

		while(a>0)//1

		{
			int digit=a%10;//1%10=1
			 
             count++;
			a=a/10;//12/10=

		}
		while(b>0)//1
		{
			int digit=b%10;//1%10        
			b=b/10;//12/10=
			int power=pow(digit,count);
			sum =sum+power;

		}

		if (temp==sum)
		return true;
		return false;
		
		
	}

	public static int pow(int num ,int power)
	{
		 int result=1;

		while(power>0)//0>=0
		{
			result=result*num;// 16=8*2
			power--;//-1
		}
		return result;
	}

    public static boolean palindrom(int a )
	{
		int rev=0;
		int temp=a;
		while(a>0)
		{
			int digit=a%10;
		rev=(rev*10)+digit; //this statment will store the reverse value in rev 
			                // if we write only sop then it will only print thevalue.
			a=a/10;
		}
		//System.out.print(rev);
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
