class Ypattern 
{
	public static void main(String[] args) 
	{
        int num=9;
         for (int row=0; row<num; row++  )
         {
             for (int col=0; col<num; col++ )
             {
                  if (row==col && row<=num/2 || row+col==num-1 && col>=num/2 || row>num/2 && col==num/2)
                  {
                     System.out.println("* ");  
                  }
                  else
                  {
					System.out.println(" ");
                  }
             }
          System.out.println();
         }
		
	}
}
