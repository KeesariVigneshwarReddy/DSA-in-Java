/* Q3) Fibonacci - Tabulation */
import java.util.*;
public class Fibonacci_Tabulation 
{
    public static void main(String[] args) 
    {
        int n = 5;
        // Step 1 -> initialization
        int dp[] = new int[n + 1];
        dp[1] = 1;
        // Step 2 -> Meaning
        // dp[i] <=> i th Fibonacci
        // Step 3 -> Filling from small to large
        for (int i = 2; i <= n; i++)
        {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.print(dp[n]);
    }
}
