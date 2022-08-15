import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
             Scanner abhi=new Scanner(System.in);
             int N= abhi.nextInt();
             int [] a= new int[N];
             HashMap<Integer,Integer> map = new HashMap<>();
             for(int i=0;i<N;i++){
                   a[i]=abhi.nextInt();
                   map.put(a[i],map.getOrDefault(a[i],0)+1);
             }
             long sum=0;
             for(int i=0;i<N;i++){
                 sum += gcd(a[i],map.get(a[i]));
             }
             System.out.println(sum);
    }
    static int gcd(int a, int b)
    {
       if(b==0)
       return a;
       return gcd(b,a%b);

    }
}
