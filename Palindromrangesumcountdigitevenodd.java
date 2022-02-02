//find sum of palindrom nos. in user given range and count digit of sum and check count is even or odd.
import java.util.Scanner;
 class Palindromrangesumcountdigitevenodd
{
	public static void main(String[] args) 
	{                                                        
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter first no  ");
		int a=sc.nextInt();

		System.out.print("Enter second no  ");
		int z=sc.nextInt();

		int sum=0;
		
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
			
		}

		sum=sum+rev;	
		   
		}

		System.out.println(sum+" This is sum of  palindrom nos. in given range.");

		int count=0;
		
		while(sum>0)

		{
			int sepdigit=sum%10;
			                                     //seprate digits in given no logic is used here
//			System.out.println(sepdigit);

			sum=sum/10;
			count++;

		}

		System.out.println(count+"This is a count of digits in sum of palindrom nos. in given range ");

        if (count%2==0)
        {
			System.out.println(count+" Count of digits in sum of palindrom nos. in given range is EVEN ");
        }

		else
		{
		   System.out.println(count+" Count of digits in sum of palindrom nos. in given range is ODD ");	
		}

	}
}