//waptd count the prime no from given array and check the count is prime or not by using methods.
import java.util.Scanner;
class methodArrayPrimenoCountPrimenot
{
	public static void main(String[] args) //------------->main method stars
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the size");
		int size=sc.nextInt();

		int a[]=new int [size];

		for (int i=0; i<size; i++ )
		{
			System.out.println("Enter the value in "+i+"index");
			a[i]=sc.nextInt();
		}//--------------------------------------------------------------->array Scanner end
        
		int pcount=0;
		System.out.println(" This are the prime no from user given array ");
		for (int i=0;i<size ;i++ )
		{
           // System.out.println(a[i]);

		   boolean res1=prime(a[i]);
		   if (res1)
		   { 
              System.out.print(a[i]+"  ");
			  pcount++;// counting prime no
		   }
		   //System.out.println(res1);   
		}
                 System.out.print("");
		        if(prime(pcount)==true)
		        {
					System.out.println(pcount+"count of prime no is prime");
		        }//-------------------------------------------------------------------------->count checking prime or not done
	}

	public static boolean prime(int a)//----------------->method of prime no start
	{
		int x=2;

		while(a>=x)
		                                
		{
			if (a%x==0)
			{
				break;
			}
        x++;

		}
		 if(a==x)
		 return true;//return boolean value

		 else
	     return false;//return boolean value	
	}//-------------------------------------->method of prime no end
}
