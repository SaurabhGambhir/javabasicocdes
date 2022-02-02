import java.util.Scanner;//reverse the user given number

class Reverseno 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("enter first no  ");
		int a=sc.nextInt();//5678
		int rev=0;

		//String rev1=" ";

		while(a>0)//5

		{
			int digit=a%10;//5%10=5 
			rev=(rev*10)+digit;//8765=(876*10)+5//this statment will store the reverse value in rev 
			                   // if we write only sop then it will only print thevalue.not store.
			//rev1=rev1+digit;// 8 7 6 5=8+7+6+5
			a=a/10;// 5  =56/10

		}
		System.out.print(rev);
		//System.out.print("reverse value is"+rev1);

	}
}