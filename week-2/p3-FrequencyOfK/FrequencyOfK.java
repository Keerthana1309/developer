import java.io.*;
import java.util.*;
class FrequencyOfK
{
    public static void main(String args[])
    {
        ArrayList<Integer> array=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0;i<N;i++)
        {
             array.add(sc.nextInt());
        }
        int k=sc.nextInt();
        System.out.println(frequency(array,k,0,0));
   }
   static int frequency(ArrayList array,int k,int N,int count)
  {
     if(N==array.size())
        return count;
     if(k==(int)array.get(N))
        count++;
     return(frequency(array,k,N+1,count));
  }
}
         