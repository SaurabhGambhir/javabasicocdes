//print the prime no from user given range 
import java.util.Scanner;
class Primenouserrange
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println(" Enter First no  ");
		int start=sc.nextInt();//3

		System.out.println(" Enter Second  no  ");
		int stop=sc.nextInt();//10
               //3<=10
		while (start<=stop)
		{

            int i=2;

			while (start>=i)//3>=2--->true
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
           }
		    start++;

        }

	}

}

