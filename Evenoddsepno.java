import java.util.Scanner;//write a program to seprate the digits of given no.
class Evenoddsepno 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("enter first no  ");
		long num=sc.nextLong();//9845141124
      
	   String ev="",od="";
	   while (num>0)
	   {
		   long dig=num%10;

		   if(dig%2==0)
			   ev=dig+ev;
		   else
			   od=dig+od;

		   num=num/10;
	   }
       System.out.print(ev);
	   System.out.print(od);

	}
}//waptd check the user enterd no is perfect no or not.