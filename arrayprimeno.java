//waptd prime numbers from given array
class arrayprimeno
{
	public static void main(String[] args) 
	{
		int a[]={10,11,12,13,14,15,16,17};

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
           System.out.println(a[i]+" 3 is prime no  ");
		}

		}
	}
}





