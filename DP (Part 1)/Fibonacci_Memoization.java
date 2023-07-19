/* Q2) Fibonacci Optimised - Memoization */
import java.util.*;
public class Fibonacci_Memoization 
{
    public static int Fibonacci(int n, int F[])
    {
        if (n == 0 || n == 1)
        {
            return n;
        }
        if (F[n] != 0)
        {
            return F[n];
        }
        else
        {
            F[n] = Fibonacci(n - 1, F) + Fibonacci(n - 2, F);
        }
        return F[n];
    }
    public static void main(String[] args)
    {
        int n = 5;
        int F[] = new int[n + 1];
        System.out.println(Fibonacci(n, F));
    }   
}
