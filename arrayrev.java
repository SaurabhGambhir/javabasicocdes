//print array in reverse order without changing condition in for loop 
class arrayrev
{
	public static void main(String[] args) 
	{
		int a[]={10,11,12,13,14,15,16,17};
		
		System.out.println("size"+a.length);

		System.out.println("index size"+(a.length-1));

		System.out.println(a[6]);

		System.out.println(a[1]);

		//System.out.println(a[8]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 8
                                                    //at array.main(array.java:15)
          

		 a[5]=99;

		 for (int i=a.length-1;i>=0 ;i-- )////printing array in reverse order by changing condition.
		 {

			 System.out.print(a[i]+"  ");
		 }

	}
}
