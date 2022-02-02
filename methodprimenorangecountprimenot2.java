// waptd count prime palindrom no from user given range and check it is a plindrom or not.
import java.util.Scanner;
class methodprimenorangecountprimenot2 
{
	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);

		System.out.print(" Enter First no  ");
		int start=sc.nextInt();//3
             System.out.println();
		System.out.print(" Enter Second  no  ");
		int end=sc.nextInt();//10
 
 
		System.out.println();
		System.out.print("the primepalindrom  nos are  ");
		//----------------------------------------------------------> Scanner for user given range end

		int count=0;
		for (int i=start; i<=end; i++ )
		{
		boolean res1=prime(i);// prime method calling statment & storing
		int res2=palindrom(i);// palindrom method calling statment & storing
        
          //System.out.print(res2+"  ");

		if(res1==true && res2==1)
			{
				count++;//count primepalinmdrom no
				System.out.print(i+"  ");
			}
		}
       System.out.println();//
      System.out.println(count+"  This is a count of prime palindrom no in given range  ");//print count of prime palindrom no.

	  int res3=palindrom(count);//checking count is palindrom or not by calling palindrom method.
	  if (res3==1)
	  {
		  System.out.print(count+"  This count is palindrom no.  ");//print count of prime palindrom no.
	  }
	  else
		{
			System.out.print(count+"  This count is not palindrom no.  ");//print count of prime palindrom no.
		}
	}

	public static boolean prime(int a)//----------------->method of prime no start
	{
		int x=2;

		while(a>=x)
		                                
		{
			if (a%x==0)
			{
				break;
			}
        x++;

		}
		 if(a==x)
		 return true;//return boolean value

		 else
	     return false;//return boolean value	
	}//-----------------------------------------------------> method of prime no end

	public static int palindrom(int a)//-------------> method of palindrom no start
	{
		int temp=a;
		int rev=0;
        int acount=0;
		while (a>0)
		{
           int digit=a%10;
		   rev=(rev*10)+digit;
		   a=a/10;

		   //return a;
		   acount++;
           

		}
		if (temp==rev)
			return 1;//return int value
		else
			return 0;//return int value

	}//---------------------------------------------> method of palindrom no end

}