//waptd count the even and odd numbers from given array and add the count of even and odd then check sum is even or odd.
class arrayevenoddcountsumevenoddeumeven
{
	public static void main(String[] args) 
	{
		int a[]={10,11,12,13,14,15,16,17};
		
	
		 int sum=0;
		 int ecount=0;
		 int ocount=0;
		 

		 for (int i=0;i<a.length ;i++ )
		 {
			 if (a[i]%2==0)
			 {
				 System.out.println(a[i]+"  ");
				 ecount++;
			 } 
		 }

System.out.println(ecount+" This is count of even numbers in array  ");

   for (int i=0;i<a.length ;i++ )
		 {
	        if (a[i]%2!=0)
	        {
				System.out.println(a[i]+"  ");
				ocount++;
	        }
		 }
System.out.println(ocount+" This is count of odd numbers in array ");

       sum=ecount+ocount;

	   if(sum%2==0)
		{
		System.out.println(sum+" sum of count of EVEN and ODD numbers in array is EVEN ");
		}

		else
			{
				System.out.println(sum+" sum of count of EVEN and ODD numbers in array is ODD ");
			}
		
	}
}
