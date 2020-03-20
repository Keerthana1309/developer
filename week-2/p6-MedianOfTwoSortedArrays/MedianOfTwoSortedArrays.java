import java.io.*;
import java.util.*;
class MedianOfTwoSortedArrays
{
        public static void main(String args[])
       {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] array1=new int[n];
            int[] array2=new int[n];
            for(int i=0;i<n;i++)
                 array1[i]=sc.nextInt();
            for(int i=0;i<n;i++)
                 array2[i]=sc.nextInt();
            System.out.println((array1[n/2]+array2[(n-1)/2])/2);
       }
}
  
