import java.util.Scanner;
class perfectno 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("enter first no  ");
		long num=sc.nextLong();//28 22 
        long sum=0;
		for (int i=1;i<num ;i++ )
		{
			if (num%i==0)
			{
                 //System.out.print(i+"  ");	
				 
				  sum=sum+i;
			}

		}

         if (sum==num)
         {
             System.out.print(sum+"  Entered no is perfect no  ");
         }
		 else
		{
			System.out.print("Entered no is not  perfect no  ");
		}

	}
}
//waptd print the perfect no from user enterd array.