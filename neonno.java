//check the user enterd no is neon no or not.
import java.util.Scanner;
class neonno 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("enter first no  ");
		int num=sc.nextInt();//28 22

		if(neon(num))
		{
         System.out.print(num+"  no is neon  ");
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
}