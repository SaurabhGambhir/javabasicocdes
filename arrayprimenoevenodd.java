//find the count of prime no from the given array and check the count is even or odd.
class arrayprimenoevenodd 
{
	public static void main(String[] args) 
	{
		int a[]={10,11,12,13,14,15,16,17};

		int pcount=0;

        for (int i=0;i<(a.length-1) ;i++)
        {
        
         int x=2;

		while (a[i]>=x)//
		{
			if (a[i]%x==0)//
			{
				break;//
			}
			x++;//5

		}
		if (a[i]==x)
		{
			pcount++;
          // System.out.println(a[i]+"  is prime no  ");
		}

		}

		if (pcount%2==0)
		{
             System.out.println(pcount+" count is even  ");
		}

		else
		{
			System.out.println(pcount+" count is odd  ");
			
		}
	}
}