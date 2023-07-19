/* Q6) Count ways to reach n th Stair. 
       The person can climb 1 stair or 2 stairs or 3 stairs at a time
       (Recursive) */
public class Climbing_Stairs_Variation 
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
        return count_ways(n - 1) + count_ways(n - 2) + count_ways(n - 3);
    }
    public static void main(String[] args) 
    {
        int n = 5;
        System.out.println(count_ways(n));
    }
}
