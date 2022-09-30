#include "bits/stdc++.h"
#pragma GCC optimize "03"
using namespace std;

#define ll long long int
#define ld long double
#define pi pair<int, int>
#define pb push_back
#define fi first
#define se second
#define IOS ios::sync_with_stdio(false); cin.tie(0); cout.tie(0)
#ifndef LOCAL
#define endl '\n'
#endif

const int N = 2e5 + 5;
const int mod = 1e9 + 7;
const int inf = 1e9 + 9;

int sz;
const int NN=9;

class matrix{
	public: 
	ll mat[NN][NN];
	matrix(){
	for(int i=0;i< NN;i++)
		for(int j=0;j< NN;j++)
		mat[i][j]=0;
		sz= NN;
		}
		inline matrix operator *(const matrix&a){
			matrix temp;
			for(int i=0;i< sz;i++)
			for(int j=0;j< sz;j++){
				for(int k=0;k< sz;k++){
				temp.mat[i][j]+=(mat[i][k] *a.mat[k][j]) % mod;
				if(temp.mat[i][j] >= mod)
				  temp.mat[i][j] -= mod;
				}
			}
		return temp;
		}
		inline matrix operator +(const matrix&a){
			matrix temp;
			for(int i=0;i< sz;i++)
			for(int j=0;j< sz;j++){
				temp.mat[i][j] =mat[i][j] +a.mat[i][j] ;
				if(temp.mat[i][j] >= mod)
				temp.mat[i][j] -= mod;
			}
		return temp;
		}
		inline matrix operator -(const matrix&a){
			matrix temp;
			for(int i=0;i< sz;i++)
			for(int j=0;j< sz;j++){
				temp.mat[i][j] =mat[i][j] -a.mat[i][j] ;
				if(temp.mat[i][j] < mod)
				temp.mat[i][j] += mod;
			}
			return temp;
		}
	inline void operator = (const matrix &b){
		for(int i=0;i< sz;i++)
			for(int j=0;j< sz;j++)
			mat[i][j] =b.mat[i][j];
	}
	inline void print(){
	  for(int i=0;i< sz;i++){
			for(int j=0;j< sz;j++){
				cout << mat[i][j] << " ";
			}
		cout << endl;
	  }
	}
};

matrix pow(matrix a, ll k){
	matrix ans;
	for(int i=0;i< sz;i++)
	  ans.mat[i][i]=1;
	while(k){
		if(k & 1)
		 ans = ans * a;
		 a = a * a;
		 k >>=1;
	}
	return ans;
}

signed main() {
	IOS;
	int n; cin >> n;
	sz = 9;
	matrix a;
   for(int i=0;i<sz;i++){
	   for(int j=0;j<=i;j++)
	   a.mat[i][j]=1;
   }
   a = pow(a,n);
   int ans=0;
   for(int i=0;i<sz;i++){
	   ans +=a.mat[i][0];
	   ans%=mod; 
   }
   cout << ans;
   return 0;
}
