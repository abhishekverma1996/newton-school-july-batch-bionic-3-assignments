import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc=new Scanner(System.in);
			int T=sc.nextInt();
			for(int t=0;t<T;t++){
				int row=sc.nextInt();
				int colm=sc.nextInt();

				int max=Math.max(row,colm);
				long [][]a=new long[max+1][max+1];
				for(int j=0;j<max+1;j++){
					for(int k=0;k<max+1;k++){
						if(k==0 || k==j){
							a[j][k]=1;
						}
						else if(k<j && k!=0 && j!=0){
							a[j][k]=(a[j-1][k]%((long)Math.pow(10,9)+7)+a[j-1][k-1]%((long)Math.pow(10,9)+7));
						}
						else{a[j][k]=0;}
					}
				}
				System.out.print((a[row][colm])%((long)Math.pow(10,9)+7));
				System.out.println();
			}
	}
 }
