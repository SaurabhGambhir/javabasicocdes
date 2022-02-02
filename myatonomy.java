import java.util.Scanner;
class myatonomy  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the size");
		int size=sc.nextInt();

		int a[]=new int [size];

		for (int i=0; i<size; i++ )
		{
			System.out.println("Enter the value in "+i+"index");
			a[i]=sc.nextInt();
		}
        int temp=0;
        System.out.println("InputNo");
		int InputNo=sc.nextInt();
        
         System.out.println("Output is");
		for (int i=0;i<a.length ;i++ )
               {
				
                       if(InputNo<a[i])
                          {
							temp=a[i];
                             for (int x=InputNo; x<=temp ; x++ )
                             {
                                 if (x>InputNo && x<temp)
                                 {
                                       System.out.println(x);
                                 }
                                // else
                                // {
									//System.out.println(temp);
                                // }
                                 
                             }
                             break;
                          }
                 
               }
}
} 