import java.util.Scanner;
class  Dowhile1
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

        System.out.println("Enter first no");
		int a=sc.nextInt();
		int x=a;

		System.out.println("Enter second no");
		int b=sc.nextInt();
		int y=b;
		
		int i=a;
		int sum=0;//initialization
		long product=1L;//initialization
		do
		{
		  if (i%2==0)
		  {
		        sum=sum+i;
		  }
		  else
			{
				product=product*i;
			}
			
			i++;//updation
		  
		}
		while (i<=b);//condition
		System.out.println("sum of even no. from "+x+" to "+y+" is "+sum);
        System.out.println("product of odd no. from "+x+" to "+y+" is "+product);
	}
	
}
