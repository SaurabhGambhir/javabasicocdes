//waptd print the perfect no from user enterd array.
import java.util.Scanner;
class arrayscannerperfectno  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the size");
		int size=sc.nextInt();

		int a[]=new int [size];

		for (int i=0; i<size; i++ )
		{
			System.out.println("Enter the value in "+i+"index");
			a[i]=sc.nextInt();
		}
        

		for (int i=0;i<a.length ;i++ )

		{
			long sum=0;
           //System.out.println(a[i]);
		
		for (int x=1;x<a[i] ;x++ )
		{			
			if (a[i]%x==0)
			{		
                 //System.out.print(x+"  ");	
				 	
				  sum=sum+x;
			}		
					
					
		}			
         if (sum==a[i])
         {
             System.out.print(sum+"  Entered no is perfect no  ");
         }

		
		
		}
	}
}

