//print the prime no from user given range 
//waptd count the prime no from user given range and check the count is prime or not
// waptd find the sum of prime no and check the sum is palindrom or not
//waptd check the user given number is prime as well as palindrom or not
//waptd print the prime palindrom number from the user given range
//waptd cont the prime palindrom number from user given range and check the count is prime or not.
import java.util.Scanner;
class Primeno
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println(" Enter no  ");
		int start=sc.nextInt();//5

		System.out.println(" Enter no  ");
		int stop=sc.nextInt();//5

		int i=2;
                 //3         12     
		for (int a=start; a<=stop; a++ )
		{
		

		while (a>=i)//3>=2-->true
		{
			if (a%i==0)//3%2==0--->false
			{
				break;//
			}
			i++;//

		}
		if (a==i)
		{
           System.out.println(a+"  Entered  no is prime no  ");
		}
		
		}

	}

}