//find the count of prime no from the given array and check the count is even or odd.
//waptd palindrom numbers from the EVEN index and prime no from odd index.
//waptd find the prime palindrom from the given array.
class primepalindromnoarray 
{
	public static void main(String[] args) 
	{
		 int a[]={11,22,33,456,234,17,121,333};
	   int x=2;
		 for (int i=0;i<a.length ;i++ )
		{
		

		while (a[i]>=x)//
		
			if (a[i]%x==0)//
			{
				break;//
			}
			x++;//

		
	if (a[i]==x)
	{
           System.out.println(a[i]+"  Entered  no is prime no  ");
           
		   int j=a[i];
		   int rev=0;
		
		   int temp=a[i];

		

		while(a[i]>0)

		{
			int digit=a[i]%10;
		    rev=(rev*10)+digit;
			
			a[i]=a[i]/10;

		}
		
        if (temp==rev)
		{
            System.out.print(j+"  Entered no is a palindrom.");
		}
		
	}

	}
	}

}