//waptd reverse the values in given array.

class arrayrevvaluesinarray2
{
	public static void main(String[] args) 
	{
		int a[]={49,2,61,1,21,99,122};
		
		//        1   1<8         1
		 for (int i=0;i<a.length ;i++ )
		 {
         int x=a[i];//11
	      int rev=0;//0
		int temp=x;//8
		 while(x>0)//

		{
			int digit=x%10;//1 =1%10
			rev=(rev*10)+digit;//  11==10+1
			x=x/10;//0=1/10

		}

		 System.out.print(rev+"  ");//1 11 

		 }
		

	}

}
