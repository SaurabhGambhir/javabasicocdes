//waptd cgpa of user enterd marks and marks in percentage.
import java.util.Scanner;
class CGPA
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter size of array");
		int size=sc.nextInt();

		int a[]=new int [size];
		double g[]=new double[size];
		double sum=0,cgpa;
           
		for (int i=0; i<size; i++ )
		{
			System.out.println("Enter the value in "+i+"index");
			a[i]=sc.nextInt();
		}
        
       
		
		for (int i=0; i<size; i++ )
		{  
           g[i]=a[i]/10;
		}
        
		for (int i=0; i<size; i++ )
		{ 
		   sum=sum+g[i];     
		}

		cgpa=sum/10;
        
		System.out.println(cgpa+" is CGPA of marks");

		System.out.println(cgpa*9.5+" is marks in percentages");

	}
}