import java.util.Scanner;
class Power 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("enter first no  ");
		int num=sc.nextInt();//2
                                              //scanner and initialization and declaration
		System.out.print("enter second no  ");
		int power=sc.nextInt();//3

		
	    int result=1;

		while(power>=0)//0>=0
		{
			result=result*num;// 16  =8*2
			power--;//-1

		}
		System.out.print(result);//16
	}
	
	}


