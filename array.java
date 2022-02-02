class array
{
	public static void main(String[] args) 
	{         // 0  1  2  3  4  5  6  7 
		int a[]={10,11,12,13,14,15,16,17};
		
		System.out.println("size"+a.length);//8

		System.out.println("index size"+(a.length-1));//8-1==7

		System.out.println(a[6]);//16

		System.out.println(a[1]);//11

		//System.out.println(a[8]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 8
                                                    //at array.main(array.java:15)
          

		 a[5]=99;

		 for (int i=0;i<(a.length-1) ;i++ )
		 {                                    //printing values  

			 System.out.print(i+"="+a[i]+"  ");
		 }


             System.out.println(" ");

		 for (int i=0;i<a.length ;i++ )     // printing index
		 {
			 System.out.print(i+"  ");
		 }


	}
}
