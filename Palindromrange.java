//check all the palindrom no from user enterd RANGE. 
import java.util.Scanner;
 class Palindromrange 
{
	public static void main(String[] args) 
	{                                                        
		Scanner sc=new Scanner(System.in);

		System.out.print("enter first no  ");
		int a=sc.nextInt();

		System.out.print("enter second no  ");
		int z=sc.nextInt();

		int count=0;
		
		while (a<=z)
		
		{
		
		int rev=0;
		
		int num=a;
		
		int temp=num;

		

		while(num>0)

		{
			int digit=num%10;
		
		    rev=(rev*10)+digit;//this statment will store the reverse value in rev 
			                   // if we write only sop then it will only print thevalue.
			
			num=num/10;

		}
		
		a++;

        if (temp==rev)
		{
            System.out.println(rev+" This no is a palindrom.");
			count++;//modification--check count of palindrom no. is even or odd.
		}
		   
		}
		 System.out.println(count+" This is a count of palindrom no. in given range");
          if (count%2==0)
          {
			  System.out.println(count+" The count of palindrom no. in given range is even");
          }

		  else
			  {
				System.out.println(count+" The count of palindrom no. in given range is odd");
			  }
	}
}