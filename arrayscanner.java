//take values from user and print array
import java.util.Scanner;
class arrayscanner  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the size");
		int size=sc.nextInt();

		int a[]=new int [size];
            //    1     1<5   1
		for (int i=0; i<size; i++ )//0
		{
			System.out.println("Enter the value in "+i+"index");
			a[i]=sc.nextInt();//a[4]
		}

		System.out.println("values of array\n");
                //0  0<5    0
		for (int i=0;i<size ;i++ )
		{
           // System.out.println(a[i]);
		   if(EvenoddArrayCountEvenPerfectornotOddprimeneon.prime(a[i]))
			{
				System.out.println(a[i]+"is prime");
			}
			else
				{
				System.out.println(a[i]+"is  not prime");
			}

		}
	}
}
