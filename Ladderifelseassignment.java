class Ladderifelseassignment 
{
	public static void main(String[] args) 
	{
		int a=0,b=-20;
		if (a>0 && b>0)
		{System.out.println("both no. are positive");}
		else if (a<0 && b<0)
		{System.out.println("both no. are negative");}
		else if (a==0 && b==0)
		{System.out.println("both no. are zero");}
		else if (a>0 && b<0)
		{System.out.println("a is positve and b is negative");}
		else if (a<0 && b>0)
		{System.out.println("a is negative and b is positive");}
		else if (a>0 && b==0)
		{System.out.println("a is positive and b is zero");}
		else if (a<0 && b==0)
		{System.out.println("a is negative and b is zero");}
		else if (a==0 && b>0)
		{System.out.println("a is zero and b is positive");}
		else
		{System.out.println("a is zero and b is negative");}
		
	}
}
