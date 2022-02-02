class  varlengthargs
{
	public static void main(String[] args) 
	{
		
         

          if (prime(12,15,2,54))
          {
             System.out.println("prime no");
          }
          else
          {
			System.out.println("not prime no");
          }


        
	}
     public static boolean prime(int ...num)
     {
            int x=2;

			while (num>=x)//3>=2--->true
			{
		
			   if (num%x==0)//
			  {
				break;//
			  }
			    x++;
		    }

           if (num==x)
			{
                return true;
			}

		   else
			{
			    return false;
			}
	}

}
