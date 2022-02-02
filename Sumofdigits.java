import java.util.Scanner;//find the sum of digits present in a given no 
class Sumofdigits 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("enter first no  ");
		int a=sc.nextInt();//5678
		int sum=0;
		
		while(a>0)//0

		{
			int digit=a%10;//5%10=5
			System.out.println(digit);//5

			a=a/10;//5/10=0

           
				 sum=sum+digit;//26=21+5
				
        }
		System.out.println(sum);
		
		
	}
}
//find the sum of digits present in a given no 