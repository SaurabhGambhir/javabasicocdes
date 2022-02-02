import java.util.Scanner;
import java.util.Arrays;
class arrscanner
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

/*		System.out.println("enter the size");
		int size=sc.nextInt();

		int a[]=new int [size];

/*		for (int i=0; i<size; i++ )
		{
			System.out.println("Enter the value in "+i+"index");
			a[i]=sc.nextInt();
		}
         System.out.println();
//Enhanced For loop Syntax:- for(datatype ref_variable : a(array name) )
                            for (int num:a )                             //for every element in the array print the element
		{
			System.out.println(num);//here num represents element of the array.	
		}

        System.out.println(Arrays.toString(a));//ANOTHER WAY OF PRINTING   */



          String[] str= new String[4];
          for(int i=0; i< str.length; i++)
          {
              System.out.println("enter the string/object in "+i+ " index"); 
			str[i]= sc.next();
          }
         System.out.println(Arrays.toString(str));
        // System.out.println(str[5]);  // array index out of bound exception.
        
        str[2]="swapnil";
         
          System.out.println(Arrays.toString(str));

  }
}