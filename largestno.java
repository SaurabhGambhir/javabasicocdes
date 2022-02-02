class Largestno
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=5;
		int c=200;
		int d=40;

		int result= a>b? ( a>c? (a>d? a : d ) : ( c>d? c : d )) : ( b>c? ( b>d? b : d ) : ( c>d? c : d ));
		System.out.println("result is--->"+result);
	
         int smallest= a<b? ( a<c? (a<d? a : d ) : ( c<d? c : d )) : ( b<c? ( b<d? b : d ) : ( c<d? c : d ));
         System.out.println("result is--->"+smallest);
}
}