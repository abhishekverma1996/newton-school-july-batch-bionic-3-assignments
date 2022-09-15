import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

   public void rearrange(long arr[],long n){
       long temp[] = new long[arr.length];
       int con=0;
       int ind= 0;
       for(long a1:arr){
           if(a1<0){
               con++;
           }
       }
       for(long ele:arr){
           if(ele<0){
               temp[ind++] = ele;
           }else{
               temp[con++]= ele;
           }
       }
       for(int i=0;i<n;i++){
           arr[i]=temp[i];
       }
   }
    public static void main (String[] args) throws IOException {
                      // Your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n =Long.parseLong(br.readLine().trim());
        long arr[]= new long[(int)(n)];
        String inputLine[] = br.readLine().trim().split(" ");
        for(int i=0;i<n;i++){
            arr[i]= Long.parseLong(inputLine[i]);
        }
        Main obj = new Main();
        obj.rearrange(arr,n);
        StringBuilder output= new StringBuilder();
        for(int i=0;i<n;i++){
           output.append(arr[i]+ " ");
        }
        System.out.println(output);
    }
}
