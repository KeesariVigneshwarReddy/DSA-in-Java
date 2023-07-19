/* Q5) Climbing stairs - Memoization
       TC = O(n)
       SC = O(n)
 */
public class Climbing_Stairs_Memoization 
{
    public static int count_ways(int ways[], int n)
    {
        // there is only one way to stay on ground
        if (n == 0)
        {
            return 1;
        }
        // there is no way to go inside ground
        if (n < 0)
        {
            return 0;
        }
        if (ways[n] == 0)
        {
            ways[n] = count_ways(ways, n - 1) + count_ways(ways, n - 2);
        }
        else
        {
            return ways[n];
        }
        return ways[n];
    }
    public static void main(String[] args) 
    {
        int n = 5;
        // using a storage where ways[i] -> no. of ways to climb i stairs 
        int ways[] = new int[n + 1];
        System.out.println(count_ways(ways, n));
    }
}
