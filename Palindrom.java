 //check the user entered no. is palindrom or not 
import java.util.Scanner;
 class Palindrom 
{
	public static void main(String[] args) 
	{                                                          ////watch
		Scanner sc=new Scanner(System.in);

		System.out.print("enter first no  ");
		int a=sc.nextInt();
		
		int rev=0;
		
		int temp=a;

		

		while(a>0)

		{
			int digit=a%10;
		rev=(rev*10)+digit;//this statment will store the reverse value in rev 
			                   // if we write only sop then it will only print thevalue.
			
			a=a/10;

		}
		System.out.print(rev);
		

        if (temp==rev)
		{
            System.out.print("entered no is a palindrom.");
		}
		else
		{
			System.out.print("entered no is not a palindrom.");
		}

	}
}

