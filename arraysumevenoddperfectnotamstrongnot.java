//waptd find the sum of given array and check the sum is even or odd.if it is even check perfect no or not.if it is odd check amstrong or not.
//waptd find the sum of given array check sum is even or odd if it is even check perfect or not and odd then check amstrong or not.
import java.util.Scanner;
class arraysumevenoddperfectnotamstrongnot 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the size");
		int size=sc.nextInt();

		int a[]=new int [size];
           
		for (int i=0; i<size; i++ )
		{
			System.out.println("Enter the value in "+i+"index");
			a[i]=sc.nextInt();
		}
          int sum=0;
         
         
         for (int i=0; i<size; i++)
         {
             sum=sum+a[i];
         
            
         }
          //System.out.println(sum+" is sum of array");
          if(evenodd(sum))
          {
              //System.out.println(sum+" sum of array is Even.");
              if(perfect(sum))
              {
				System.out.println(sum+" sum of array is Even and perfect.");
              }
              else
              {
				System.out.println(sum+" sum of array is Even and not perfect.");
              }
             
          }
          else
          {
             // System.out.println(sum+" sum of array is Odd.");
             if (armstrong(sum))
             {
                System.out.println(sum+" sum of array is Odd and it is armstrong."); 
             }
             else
             {
                System.out.println(sum+" sum of array is Odd and it is not armstrong."); 
             }
          }

	}
     
     public static boolean evenodd(int a)
     {
		if(a%2==0)
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
    
     
}


