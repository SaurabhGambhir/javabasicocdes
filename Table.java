import java.util.Scanner;
class Table 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter no  ");
		int num=sc.nextInt();

       
        for (int a=1; a<=num; a++ )
      {
        
            for(int i=1;i<=10;i++)
		  {
				
			System.out.println(a+"*"+i+"="+(a*i));
			
		  }
		   
	  }
	
	}

}


