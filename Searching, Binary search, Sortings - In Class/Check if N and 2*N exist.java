import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
 public static boolean checkIfExist(int[] arr){
     int n = arr.length;

     for(int i=0;i<n;++i){
         for(int j=0;j<n;++j){
             if(i!=j){
                 if(arr[i]==2*arr[j]){
                     return true;
                 }
             }
         }
     }
     return false;
 }

    public static void main (String[] args) {
                      // Your code here
                      Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int A[]= new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        if(checkIfExist(A)){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");

        }
    }
}
