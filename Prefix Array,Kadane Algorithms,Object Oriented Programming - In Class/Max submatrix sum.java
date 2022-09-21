import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int maxSubMatrix (int arr[][], int row, int col)
    {
        int sum[] = new int[row];
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < col; i++)
        {
            Arrays.fill(sum, 0);
            for(int j = i; j < col; j++)
            {
                for(int k = 0; k < row; k++)
                {
                    sum[k] += arr[k][j];
                }
                int curMaxSum = kadane(sum);
                maxSum = Math.max(maxSum, curMaxSum);
            }
        }
        return maxSum;
    }

    public static int kadane(int [] arr)
    {
        int n = arr.length;
        int maxSoFar = Integer.MIN_VALUE, maxEndingHere = 0;
        for(int i = 0; i < n; i++)
        {
            maxEndingHere =  maxEndingHere + arr[i];
            if(maxSoFar < maxEndingHere)
                maxSoFar = maxEndingHere;
            if(maxEndingHere < 0)
                maxEndingHere = 0;
        }
        return maxSoFar;
    }

    public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] arr = new int[n][m];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(maxSubMatrix(arr, n, m));
    }
}
