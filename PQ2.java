/* 2) Print sum of elements in second row of a matrix */
import java.util.*;
public class PQ2
{
    public static void getMatrix(int a[][], int n, int m)
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
    }
    public static void printMatrix(int a[][], int n, int m)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int sumOfSecondRow(int a[][], int n, int m)
    {
        int sum = 0;
        for (int i = 0; i < m; i++)
        {
            sum += a[1][i];
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // inputing rows and columns and key
        int n = sc.nextInt();
        int m = sc.nextInt();
        // declaring the matrix
        int a[][] = new int [n][m];
        // inputing all the elements one by one with help of this function
        getMatrix(a, n, m);
        // printing all elements in form of matrix with help of this function
        printMatrix(a, n, m);
        // printing sum of elements in second row
        System.out.println("Sum of elements in second row = " + sumOfSecondRow(a, n, m));
    }
}
