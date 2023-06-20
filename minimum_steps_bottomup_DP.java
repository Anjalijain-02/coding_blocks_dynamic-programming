// Bootom up approch DP:
import java.util.*;
public class Main
{ 
    public static int minsteps(int n)
   {
         
	    int dp[]=new int[n+1];
        // base case:
        dp[1]=0;
        for(int i=2;i<=n;i++)
   {
        int op1=Integer.MAX_VALUE;
        int op2=Integer.MAX_VALUE;
        int op3=Integer.MAX_VALUE;
        if(n%3==0)
        {
            op1=dp[i/3]+1;
        }
        if(n%2==0)
        {
            op2=dp[i/2]+1;
        }
    
            op3=dp[i-1]+1;
        
       dp[i]=Math.min(op1,Math.min(op2,op3));
   }
        
   return dp[n];     
   }
	public static void main(String[] args) {
	    int n=5;
	    
		System.out.println(minsteps(n));
	}
}
