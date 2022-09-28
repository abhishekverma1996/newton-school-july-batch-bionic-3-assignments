import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int maxarea(int n,int m,int h[],int v[]){
        Arrays.sort(h);
        Arrays.sort(v);
        int maxh = Math.max(h[0],n - h[h.length - 1]);
        int maxv = Math.max(v[0],m - v[v.length -1]);
        for(int i=0;i<h.length -1;i++){
            maxh = Math.max(maxh,h[i+1] - h[i]);
        }
        for(int i =0;i<v.length - 1;i++){
            maxv = Math.max(maxv,v[i+1] - v[i]);
        }
        return(int)((long)maxh*maxv%1000000007);
    }

    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int H = sc.nextInt();
        int V = sc.nextInt();
        int arr[] = new int[H];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int brr[] = new int[V];
        for(int i=0;i<brr.length;i++){
            brr[i] = sc.nextInt();
        }
        System.out.println(maxarea(N,M,arr,brr));
    }
}
