//count the prime no from user given range and check the count is prime or not by using method.
//waptd count the prime no from given array and check the count is prime or not byn using methods.

class methodprimeno 
{
	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);

		System.out.println(" Enter First no  ");
		int start=sc.nextInt();//3

		System.out.println(" Enter Second  no  ");
		int stop=sc.nextInt();//10

		int count=0;

		     boolean result=prime();
			 System.out.println(result);

			 if (result==true)
			 {
				 count++;
			 }


	}


     public static boolean prime(int start, int stop)
     {
	
		
		while (start<=stop)
		{

            int x=2;

			while (start>=x)//3>=2--->true
			{
		
			   if (start%x==0)//
			  {
				break;//
			  }
			
			    x++;//

		    }

		  
           
           if (start==x)
			{
           return true;
			}

		   else
			{
			return false;
			}
		    start++;

        }

	}

}
