#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

int main() {

	// Your code here
    int t ; 
     cin >> t ;
     
       bool a [ 1000001 ] ;
        int n = 100000 ;   
         a [2] = true ; 
          for (int i= 3; i<=n;i=i+2)
           { 
              a [ i ] = true ; 
            } 
          for (int i=2;i*i<=n; i++)
           {
               if ( a [ i ] ) 
               { 
                for (int j=i*i;j<=n;j=j+i) 
                     { 
                         a [ j ] = false ;  
                     } 
               }
           }
           int b [ 1000001 ] ;
           b [ 1 ] = 0 ;  
           b [ 2 ] = 1 ;  
           for ( int i=3;i<=n;i++ ) 
               {
               b [ i ] = b [ i - 1 ] ; 
               if ( a [ i ] ) 
                b [ i ] ++ ;  
               } 
              for ( int k = 0 ; k < t ; k++ )
               {
                    cin >> n ; 
                     cout << b [ n ] << "\n";  
               }
    return 0;
}
