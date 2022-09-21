import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr= new int[n];
    for(int i =0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    long[] prefixSumArray = new long[n];
    prefixSumArray[0] = arr[0];
    for(int i =1;i<n;i++){
        prefixSumArray[i] = prefixSumArray[i-1] + arr[i];
    } 
    long even =1;
    long odd = 0;
    for(int i =0;i<n;i++){
        if(prefixSumArray[i]%2 == 0){
            even++;
        }else{
        odd++;
        }
    }
    odd *= even;
    System.out.println(odd);
    }
}
