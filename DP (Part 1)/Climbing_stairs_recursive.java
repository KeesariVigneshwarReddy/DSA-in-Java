/* Q4) Climbing stairs recursive
       TC = O(2 ^ n)
       SC = O(2 ^ n)
 */
import java.util.*;
public class Climbing_stairs_recursive 
{
    public static int count_ways(int n)
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
        return count_ways(n - 1) + count_ways(n - 2);
    }
    public static void main(String[] args) 
    {
        int n = 5;
        System.out.println(count_ways(n));
    }
}
