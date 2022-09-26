import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static int maxSumCircularSubarray(int arr[]) 
	{
        int maxEnd = arr[0], maxValue = arr[0];
        int minEnd = arr[0], minValue = arr[0];
        int sum = arr[0];
		for(int i = 1; i < arr.length; i++)
        {
            maxEnd = Math.max(arr[i], maxEnd + arr[i]);
            maxValue = Math.max(maxEnd, maxValue);
            minEnd = Math.min(arr[i], minEnd + arr[i]);
            minValue = Math.min(minEnd, minValue);
            sum += arr[i]; 
        }
        if(minValue == sum)
        {
            return maxValue;
        }
        return Math.max(sum - minValue, maxValue);
	}

    public static void main (String[] args) throws IOException {
        // Your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int  t = Integer.parseInt(br.readLine());
        while (t-->0) 
        {
            String str[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            String str2[] = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
            {
                arr[i] =Integer.parseInt(str2[i]);
            }
            System.out.println(maxSumCircularSubarray(arr));
        }      
    }
}
