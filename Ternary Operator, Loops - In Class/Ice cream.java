static int Icecreams (int N, int D){
  int a=N;
  while(D-->0){
       a-=a/2;
       a*=3;
  }
  return a;
}
