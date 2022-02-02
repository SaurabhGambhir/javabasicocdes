class Tc 
{
	public static void main(String[] args) 
	{
		float f1=3.142f;
		int i1=(int)f1;
		short i2=-65; // 2 bytes
		char ch=(char)i2; // 2 bytes

		//boolean bool = (boolean)i2;

		long l1=123451; //8 bytes
		int i3=(int)l1; //4 bytes

		System.out.println(i2);
		System.out.println(i3);
	}
}
