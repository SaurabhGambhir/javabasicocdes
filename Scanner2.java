import java.util.Scanner;
class Scanner2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter first no  ");
		int a=sc.nextInt();
		
		System.out.println("enter  no  ");
		int b=sc.nextInt();

        System.out.print("even no from given range are  ");
		for(int i=a;i<=b;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+"  ");
			}
				
		}
	}
}
