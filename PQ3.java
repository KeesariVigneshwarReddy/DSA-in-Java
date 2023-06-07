/* 3) Print transpose of a matrix */
import java.util.*;
public class PQ3
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
    public static void transpose(int a[][], int n, int m)
    {
        //traversing through the matrix
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                // since diagnol element are not swapped we skip the iteration
                if (i == j)
                {
                    continue;
                }
                // we swap other elements like a[1][2] and a[2][1]
                if (i < j)
                {
                    int t = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = t;
                }
            }
        }
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
        // transposing the matrix with help of this function
        transpose(a, n, m);
        // printing transpose
        printMatrix(a, n, m);
    }
}
