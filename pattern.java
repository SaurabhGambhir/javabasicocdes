class pattern
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
        pattern3(5);
	}

    public static void pattern1(int n)
    {
      for (int row=0; row<=n; row++ )
      {
         for (int col=1; col<=row ; col++)
         {
             System.out.print("* "); 
         }
         System.out.println(" ");
      }    
    }
    
      public static void pattern2(int n)
         {
			for (int row=1; row<=n; row++ )
			{
                for (int col=0; col<n-row ; col++ )
                {
                  System.out.print("* ");     
                }
             System.out.println(" ");     
			}


         }


         public static void pattern3(int n)
    {
      for (int row=0; row<=n; row++ )
      {
         for (int col=1; col<=row ; col++)
         {
             System.out.print(col); 
         }
         System.out.println(" ");
      }    
    }
}
