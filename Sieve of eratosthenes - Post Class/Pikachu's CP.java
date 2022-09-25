import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int max=0;
        int testcase=sc.nextInt();
        int[] init=new int[testcase];
        int[] fin=new int[testcase];
        int[] F=new int[testcase];
        for(int i=0;i<testcase;i++){
            init[i]=sc.nextInt();
            fin[i]=sc.nextInt();
            if(fin[i]>max){
                max=fin[i];
            }
            F[i]=sc.nextInt();
        }
        boolean[] isprime=new boolean[max+1];
        for(int i=2;i<=max;i++){
            isprime[i]=true;
        }
        for(int i=2;i<=max;i++){
            if(isprime[i]){
                for(int j=2*i;j<=max;j+=i){
                    isprime[j]=false;
                }
            }
        }
        int[] arr= new int[max+1];
        for(int j=2;j<=max;j++){
            for (int i=1; i<=Math.sqrt(j); i++)
            {
                if (j%i==0)
                {
                    if (j/i == i){
                        if(isprime[i]){
                            arr[j]++;
                        }
                    }
                    else{
                    	if(isprime[i]){
                            arr[j]++;
                        }
                        if(isprime[j/i]){
                            arr[j]++;
                        }
                    }
                }
            }
        }

        for(int t=0;t<testcase;t++){
            int count=0;
            for(int j=init[t]+1;j<=fin[t];j++){
                if(arr[j]==F[t]){
                	count++;
                }
            }
        	if(count==0){
                System.out.println(-1);
            }
            else{
                System.out.println(count);
            }
        }
    }
}
