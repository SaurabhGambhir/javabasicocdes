
import java.util.*;
import java.util.Scanner;

public class arraysorting
 {

    public static void main(String[] args) 
     {
          Scanner input = new Scanner(System.in);

          int number[] = {1789, 2035, 1899, 1456, 2013};
           Arrays.sort(number);

           for (int i = 0; i < number.length; i++) 
           {

            System.out.print(number[i] + "\t");

           }

      }
}
