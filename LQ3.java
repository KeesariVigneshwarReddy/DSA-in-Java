/* 3) Selection sort */ 
import java.util.*;
public class LQ3
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
            // till minimum position everything is sorted
            int minPos = i;
            // this inner loop traverses through rest unsorted array
            // in the rest unsorted we take out smallest element than a[minPos]
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[minPos] > a[j])
                {
                    minPos = j;
                }
            }
            // then we swap 
            int t = a[minPos];
            a[minPos] = a[i];
            a[i] = t;
        }
        // printing array
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
} 
