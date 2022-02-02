//print the palindrom numbers from the given array

class palindromnoinarray
{
	public static void main(String[] args) 
	{
		int a[]={49,2,61,1,21,99,122};

        System.out.println("This are palindrom nos. in given array");

		 for (int i=0;i<a.length ;i++ )
		 {
			 int rev=0;
		     int temp=a[i];//

		  while(a[i]>0)
		  {
			 int digit=a[i]%10;//
		     rev=(rev*10)+digit;//
			  a[i]=a[i]/10;//
		  }
		   
		
        if (temp==rev)
		    {
            System.out.println(rev);
		    }
		

		 }
	}
}