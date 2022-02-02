//waptd find the prime palindrom from the given array.
class arrayprimepalindrom 
{
	public static void main(String[] args) 
	{
		int arr[]={11,7,625,651,811,99,5,121};
         
		 arr[2]=2;

                                           //-------------->for loop started
		for (int i=0;i<arr.length ;i++ )
		{
			int num=arr[i];
                                            //-------------->prime no started
			int j=2;

			while(num>=j)
			{
				if (num%j==0)
				{
					break;
				}
				j++;
			}
                                             //------------>palindrom no startd
			if (num==j)
			{
				int rev=0;
                
				while(num>0)
				{
					int digit=num%10;

					rev=(rev*10)+digit;

					num=num/10;
				}

				if(rev==j)

				{
					System.out.println("print palindrom value"+rev);

				}
                                                 //------------>prime no end
			}
			
                                                  //----------->prime no end

		}
		                                          //------------> for loop end
	}
}
