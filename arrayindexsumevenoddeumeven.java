//waptd find the sum of even numbers and product of even index numbers
class arrayindexsumevenoddeumeven
{
	public static void main(String[] args) 
	{
		int a[]={10,11,12,13,14,15,16,17};
		
	
		 int sum=0;
		 int prod=1;

		 for (int i=0;i<a.length ;i++ )
		 {
			 if (i%2==0)
			 {
				 System.out.print(a[i]+"  ");
				 prod=prod*a[i];
			 } 
		 }

System.out.println(prod+" This is product of even index values  ");

   for (int i=0;i<a.length ;i++ )
		 {
	        if (a[i]%2==0)
	        {
				System.out.print(a[i]+"  ");
				sum=sum+a[i];
	        }

			 
		 }
System.out.println(sum+" This is sum of even  values  ");

		

	}
}
