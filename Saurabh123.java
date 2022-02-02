class Saurabh123 
{
	public static void main(String[] args) 
	{
		int sum=0;
		for (int i=20 ; i<=60 ; i++)
		{
			if (i%7==0)
			{
             sum=sum+i; 
			}
			
		}
		
		if (sum%2==0)
		{
			System.out.println(sum+"sum is even");
		}
		else
		{
			System.out.println(sum+"sum is odd");
		}
	}
}
