class methodthreenomulprimenot 
{
	public static void main(String[] args) 
	{
		int res=multiplication(10,20,10);
		System.out.println(res+" multipication");
		prime(res);

	}


public static int multiplication(int a, int b,int c)
{
	int mul=a*b*c;
     return mul;
}


public static void prime(int a)
{
	int i=2;

		while (a>=i)//5>=5-->true
		{
			if (a%i==0)//5%5==0-->true
			{
				break;//
			}
			i++;//5

		}
		if (a==i)
		{
           System.out.println(a+"  Entered  no is prime no  ");
		}

		else
			{
				System.out.println(a+"  Entered  no is not prime no  ");
			}

}
}