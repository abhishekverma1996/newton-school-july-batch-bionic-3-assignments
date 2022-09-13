import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int check(int A[], int B[], int C[], int N, int M){
       int p=0;
      for(int k=0; k<M;k++){
       boolean isexist = binarysearch(A,0,N-1,B[k]); 
       if(isexist) {
       C[p]=B[k];
       p++;
       }
     }
   return p;
}

public static void main (String[] args) {
   Scanner scn = new Scanner (System.in);
   int N = scn.nextInt(); 
   int A[] = new int[N]; 
      for(int i =0; i<N;i++){
      A[i] = scn.nextInt();
      }
   int M = scn.nextInt();
   int B[] = new int[M]; 
      for (int j = 0; j<M; j++){
      B[j]= scn.nextInt();
      }
      int []C = new int[N];
      int p = check(A,B,C,N,M);
      Arrays.sort(C); 
      int l = A.length; 
      for (int j=l-p; j<C.length; j++){
      System.out.print(C[j] + " ");
  }
}
public static boolean binarysearch( int A[], int startindex, int lastindex, int f){
      int mid = (startindex+lastindex)/2; 
      int midElt = A[mid]; 
      boolean res = false; 
      if(f==midElt) 
      return true;
      if(startindex>lastindex)
      return false; 
      if(f>midElt) 
      res = binarysearch(A, mid+1, lastindex, f);
         else if(f<midElt) res = binarysearch(A, startindex, mid-1, f);
         return res;
     }
  }
