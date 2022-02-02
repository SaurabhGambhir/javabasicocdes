import java.util.Scanner;//write a program to seprate the digits of given no.
class Seprateno 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("enter first no  ");
		int a=sc.nextInt();

		while(a>0)//1

		{
			int digit=a%10;//1%10=1
			System.out.print(digit+"  ");//4  3  2 1  

			a=a/10;//12/10=1

		}
	}
}
