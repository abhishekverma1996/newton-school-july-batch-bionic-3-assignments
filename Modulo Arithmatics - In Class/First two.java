static int firstTwo(int N){
//Enter your code here
int rev =0;
        while(N>0){
                int remainder = N%10;
                rev = rev*10+remainder;
                N=N/10;
        }
        return rev%100;
}
