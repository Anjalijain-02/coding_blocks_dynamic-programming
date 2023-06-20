

// top down dp 
import java.util.*;
public class Main
{ 
    public static int minsteps(int n,int dp[])
   {
        // base case:
        if(n==1)
        {
            return 0;
            
        }
        if(dp[n]!=0)
        {
            return dp[n];
        }
        // compute if dp[n] is not known to us;
        int op1=Integer.MAX_VALUE;
        int op2=Integer.MAX_VALUE;
        int op3=Integer.MAX_VALUE;
        
         if(n%3==0)
         {
            op1=minsteps(n/3,dp)+1;
            
         }
         if(n%2==0)
         {
            op2=minsteps(n/2,dp)+1;
            
         }
         
            op3=minsteps(n-1,dp)+1;
            int ans=Math.min(op3,Math.min(op1,op2));
        return dp[n]=ans;
   }
	public static void main(String[] args) {
	    int n=5;
	    int dp[]=new int[n+1];
	    int  D=minsteps(n,dp);
		System.out.println(D);
	}
}
