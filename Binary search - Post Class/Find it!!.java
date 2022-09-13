import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long k = Long.parseLong(br.readLine());

        boolean status = false;

        for(long i=1; ((i*i)+(3*i))<=k; i++){
            if(((i*i)+(3*i))==k){
                System.out.println(i);
                status=true;
                break;
            }
        }
        if(status==false){
            System.out.println(-1);
        }
    }
}
