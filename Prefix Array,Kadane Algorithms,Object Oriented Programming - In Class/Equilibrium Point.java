import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int pivotIndex(int[] nums) {
         
        int sum = 0;
        for(int value : nums){
            sum = sum + value;
        }
         
        int start = 0, index = 0;
        for(index=0; index<nums.length; index++){
             
            sum = sum - nums[index];
            if(start == sum){
                return index;
            }
            start = start + nums[index];
        }
        return -1;
    }
    public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    System.out.print(pivotIndex(arr));
    }
}
