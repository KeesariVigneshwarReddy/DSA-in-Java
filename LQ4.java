/* 4) Diagnol Sum */
import java.util.*;
public class LQ4
{
    public static void getMatrix(int a[][], int n)
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
    }
    public static void printMatrix(int a[][], int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void diagnolSum(int a[][], int n)
    {
        // firstly we take the sum of all the elements of primary diagnol
        int pdSum = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                // whenever i is equal to j then it is an element of principal diagnol
                if (i == j)
                {
                    pdSum += a[i][j];
                }
            }
        }
        // we would have two cases when n is even or odd
        if (n % 2 == 0)
        {
            // calculating sum of secondary diagnol in case of even
            int sdSum = 0;
            for (int i = 0, j = n - 1; (i < n && j >= 0); i++, j--)
            {
                sdSum += a[i][j];
            }
            System.out.print("Diagnol Sum = " + (pdSum + sdSum));
        }
        else 
        {
            // calculating sum of secondary diagnol in case of even
            int sdSum = 0;
            for (int i = 0, j = n - 1; (i < n && j >= 0); i++, j--)
            {
                if (i == n / 2 && j == n / 2)
                {
                    continue;
                }
                sdSum += a[i][j];
            }
            System.out.print("Diagnol Sum = " + (pdSum + sdSum));
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // inputing rows and columns and key
        int n;
        n = sc.nextInt();
        // declaring the matrix
        int a[][] = new int [n][n];
        // inputing all the elements one by one with help of this function
        getMatrix(a, n);
        // printing all elements in form of matrix with help of this function
        printMatrix(a, n);
        // printing diagnol Sum
        diagnolSum(a, n);
    }
}
