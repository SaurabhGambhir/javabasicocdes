import java.util.Scanner;
class Looop5 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
        System.out.println("first no is ");
		int i=sc.nextInt();//initialization
		int x=i;

        System.out.println("Second no is ");
		int j=sc.nextInt();//initialization
		int y=j;

		int sum=0;//initialization
		long product=1L;//initialization
		
		while(i<=j)//conditon
		{
			if (i%2==0)//condition
			{
				sum=sum+i;//20=20+i
				
			}
			
			else
			{
				product=product*i;//condition
		    
			}
			i++;//updatin
		
		}

		System.out.println(" sum of even no from " +x+ " to " +j+" is " +sum);
		System.out.println(" product of even no from " +x+ " to " +y+" is " +product);
		
		
	}
}
