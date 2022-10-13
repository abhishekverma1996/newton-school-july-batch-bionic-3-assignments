import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
   public static boolean findres(int[] a,int n,int k,int x){
    int sum = 0;
    for(int i=0;i<k;i++)
    {
        sum += a[i];
        if(sum>=x)
        return true;
    }
    for(int i=k;i<n;i++)
    {
        sum += a[i] - a[i-k];
        if(sum>=x)
        return true;
    }
  return false;
}
    public static void main (String[] args) {
                      // Your code her
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int k = sc.nextInt();
    int[] a = new int[n];
    for(int i=0;i<n;i++)
    a[i] = sc.nextInt();
    if(findres(a,n,k,x))
    System.out.println("YES");
    else
    System.out.println("NO");
    sc.close();
   }
}
