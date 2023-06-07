/* 2) Modified Bubble sort */
import java.util.*;
public class LQ2
{
    public static void main(String[] args)
    {
        // inputing no. of elements, elements
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int [n];
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        // outer loop counts the turns
        for (int i = 0; i < a.length - 1; i++)
        {
            boolean swapped = false;
            for (int j = 0; j < a.length - 1 - i; j++)
            {
                if (a[j] > a[j + 1])
                {
                    // swap
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                    swapped = true;
                }
            }
            // when in one turn there is no swapping that means array is sorted
            if (swapped == false)
            {
                break;
            }
        }
        // printing array
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
