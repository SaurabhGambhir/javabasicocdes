class  Conditional
{
	public static void main(String[] args) 
	{
		int a=10, b=20;
        int large= a>b ? a:b ;
		int small= a<b ? a:b ;
		int x=-12;
		 String result= x>0 ? "positive":(x<0 ? "negative":"zero");





		System.out.println("largest no is--->" +large);
		System.out.println("smallest no is--->" +small);
		System.out.println("given number is--->" +result);

       
	}
}
