import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public void printArray(int[] arr, int n){
        for(int i=0;i<n;++i){
            System.out.print(arr[i]);
        }
    }

    public int maxValue(int a,int b){
        if(a>b){
            return a;
        }
        return b;
    }

    public void maxSubarray(int[] arr,int n, int m){
      int max=0;
      int prefix=0;
      TreeSet <Integer> record = new TreeSet<Integer>();
      record.add(0);

      for(int i=0;i<n;++i){
          prefix =(prefix+arr[i])%m;
          max = maxValue(max,prefix);
          if(record.higher(prefix)!= null){
              max = maxValue(max,prefix - (record.higher(prefix))+m);
          }
          record.add(prefix);
      }
       System.out.print(max);
      }

    public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    Main hw = new Main();
    hw.maxSubarray(arr,n,m);
    }
}
