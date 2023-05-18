/* 1) Print number of seven in a matrix */
import java.util.*;
public class PQ1
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
    public static int sevens(int a[][], int n, int m) 
    {
        // we initialize count variable with 0
        int count = 0;
        /// we traverse through matrix 
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                // if we get any element as seven we increase the cout value
                if (a[i][j] == 7)
                {
                    count++;
                }
            }
        }
        // finally returning count
        return count;
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
        // printing number of sevens
        System.out.println("Number of sevens = " + sevens(a, n ,m));
    }
}
