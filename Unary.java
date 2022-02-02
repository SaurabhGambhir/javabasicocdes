class Unary
{
	public static void main(String[] args) 
	{
		int i=10;
		int j=10;
		int k=10;
		
		i++;//10(11)
		++i;//12
		j++;//10(11)
		j++;//11(12)
		++k;//11
		++k;//12
		k++;//12(13)
		                //  14  + 11 + 12(13) + 12(13)+ 14  + 14 =77
		System.out.println( ++k + 11 + i++    + j++   + ++i + ++j);
		                //  15  + 15  + 15   + 13 + 15(16)+ 16 + 15(16) + 16 + 15(16) + 15 = 151
		System.out.println( ++j + ++k + ++i  + 13 + i++   + i  + j++    +  j + k++    + k  ); 

		
		System.out.println(
	}
}
