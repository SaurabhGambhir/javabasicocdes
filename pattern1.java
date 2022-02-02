class pattern1
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
        pattern2(4);
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
			for (int row=0; row<=n; row++ )
			{
                for (int col=n; col>0 ; col-- )
                {
                  System.out.print("* ");
                 
                }
             System.out.println(" ");     
			}


         }
}
