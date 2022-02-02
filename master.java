//waptd find the sum of given array and check the sum is even or odd.if it is even check perfect no or not.if it is odd check amstrong or not.
//waptd find the sum of given array check sum is even or odd if it is even check perfect or not and odd then check amstrong or not.
//waptd find the sum of user given range and check the no is prime no or not neon no or not perfect no or not strong no or not amstrong no or not.palindrom or not.
import java.util.Scanner;
class arraysumevenoddperfectnotamstrongnot 
{
	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        
		System.out.println("enter size of array");
        int size=sc.nextInt();
        
         int a=new int[size];

        for (i=0; i<size; i++ )
        {
           System.out.println("Enter value in "+i+"th index");
           int a[i]=sc.nextInt();
        }
        
         for (i=0; i<size; i++ )
         {
            int add=sum(a[i]);
            System.out.println(add+"is sum of array");
         }
	}
    
     public static int sum(int a)
      {
		addition=addition+a;
         
         return addition;
      }
}
