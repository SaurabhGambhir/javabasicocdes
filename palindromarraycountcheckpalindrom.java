//waptd count the palindrom numbers in given array and check the count is palindrom or not
class palindromarraycountcheckpalindrom
{
	public static void main(String[] args) 
	{
		int a[]={49,2,61,1,21,99,122};

        System.out.println("This are palindrom nos. in given array");

         int pcount=0;

		 for (int i=0;i<a.length ;i++ )
		 {
			 int rev=0;
		     int temp=a[i];//49

		  while(a[i]>0)
		  {
			 int digit=a[i]%10;//
		     rev=(rev*10)+digit;//
			  a[i]=a[i]/10;
		  }
		   
		
        if (temp==rev)
		    {
            System.out.println(rev);
			pcount++;//3
		    }
		 }
            
			System.out.println(pcount+"this is a count of palindrom no");

			
				int reverse=0;
		        int temperory=pcount;//3
		
		      while(pcount>0)//3>0
		     {
			int digit=pcount%10;//3=3%10
		         reverse=(reverse*10)+digit;//3=(0*10)+3
			
			     pcount=pcount/10;//=03/10
		     }
		System.out.print(reverse);
		

        if (temperory==reverse)
		{
            System.out.print("count is a palindrom.");
		}

			
		
		 }
	}

