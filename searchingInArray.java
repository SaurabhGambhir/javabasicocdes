public class searchingInArray
{
       public static void main (String [] args)
        {
           int[] nums={1,2,3,4,5,6,17};
           int target =-1;
           int ans=linearsearch(nums,target);
            System.out.println(ans);
        }

         public static int linearsearch(int[] arr, int target)
         {
             if (arr.length<1)
             {
                 return Integer.MAX_VALUE;
             }

             for (int element : arr) {
                 if (element == target) {
                     return element;
                 }
             }
             return Integer.MAX_VALUE;
         }
}
