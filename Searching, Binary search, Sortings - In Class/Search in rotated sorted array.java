import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int A[]= new int[N];
        int i=0;
        for(i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        int count=0;
        int key=sc.nextInt();
        for(i=0;i<N;i++){
        if(A[i]==key){
            System.out.println('1');
            count++;
        }
    }
    if(count==0){
        System.out.println('0');
    }
}
}
