import java.io.*;
import java.util.*;
class valid_parenthesis
{
       static int count=0;
       public static void main(String args[])
      {
           Scanner sc=new Scanner(System.in);
           int N=sc.nextInt();
           int count=0;
           System.out.println(ValidParenthesis(N,N));
      }
      static int ValidParenthesis(int open,int close)
      {
            if(open==0&&close==0)
            {
               count++;
            }
            if(open>close)
            {
                return count;
            }
            if(open>0)
            {
                ValidParenthesis(open-1,close);
            }
            if(close>0)
            {
                ValidParenthesis(open,close-1);
            }
            return count;
      }
}
           
     
