//count no of digit of each index in given array and check count is even or odd.
class arraycountdigitsofeachindexevenodd
{
	public static void main(String[] args) 
	{
		int a[]={49,2,61,1,21,99,122};

         
         int dcount=0;

		 for (int i=0;i<=(a.length-1) ;i++ )
		 {                                      

			// System.out.print(a[i]+"  ");
			 while(a[i]>0)//1

		     {
			int digit=a[i]%10;//
			//System.out.print(digit+"  ");//
             
			a[i]=a[i]/10;//

			dcount++;

		      }

		 }

		// System.out.println(dcount);

		 if (dcount%2==0)
		 {
			 System.out.print(dcount+"count is EVEN");
		 }

		 else
			 {

		  System.out.print(dcount+"count is ODD");
             }

	}

}