 //find the sum of even index values and check sum is even or odd.
class arrayindexsumevenodd
{
	public static void main(String[] args) 
	{//          
		int a[]={10,11,12,13,14,15,16,17};
		
	
		 int sum=0;

		 for (int i=0;i<a.length ;i++ )
		 {
			 if (i%2==0)
			 {
				 System.out.print(a[i]+"  ");
				 sum=sum+a[i];
			 } 
		 }

			System.out.println(sum+" This is sum of even index values  ");

			if(sum%2==0)
		{
			System.out.println(sum+" sum  is EVEN  ");
		}

		else
		{
			System.out.println(sum+" sum Odd  ");
		}


	}
}

