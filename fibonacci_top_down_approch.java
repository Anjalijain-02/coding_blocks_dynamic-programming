public class Main
{
    public static int fib(int n,int dp[])
    {
      
        if(n==0 || n==1)
        {
           return n;
        }
        if(dp[n]!=0)
       {
           return dp[n];
       }
        int ans;
        ans=fib(n-1,dp)+fib(n-2,dp);
        return dp[n]=ans;
    }
	public static void main(String[] args) {
		int n=6;
		int dp[]=new int[n+1];
		System.out.println(fib(n,dp));
	}
}
