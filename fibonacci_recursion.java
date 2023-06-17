public class Main
{
    public static int fib(int n)
    {
        if(n==0 || n==1)
        {
           return n;
        }
        int ans;
        ans=fib(n-1)+fib(n-2);
        return ans;
    }
	public static void main(String[] args) {
		int n=6;
		System.out.println(fib(n));
	}
}
