import java.util.Scanner;
class Dowhile3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

        System.out.print("Enter first no ");
		int i=sc.nextInt();
		
		
		System.out.print("Enter Second no ");
		int j=sc.nextInt();
		
		
		int sum=0;//initialization

		do
		{
			sum=sum+i;
			i++;
			
		}
		
		while (i<=j);//condition
		
		if (sum%2==0)
			{
				System.out.print(sum+"  sum is even");     
			}
			else
				{
			      System.out.print(sum+"  sum is odd"); 		     
				}
			      
	}
}
