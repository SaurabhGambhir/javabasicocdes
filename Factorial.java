//find factorial of  user given number
import java.util.Scanner;
class Factorial
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter no  ");
		int num=sc.nextInt();//4

		int fact=1;

		while (num>=1)
		{
			fact=fact*num;//24=24*1
			num--;//1
		}

		

		System.out.println(fact+" This is the factorial of given number ");
	}
}
