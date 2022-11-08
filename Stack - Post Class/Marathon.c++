#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;
const int N = 1e5 + 5;

int a[N], b[N];

void solve(){
    int n; cin >> n;

    for(int i = 0; i < n; i++){
        cin >> a[i] >> b[i];
    }
    int l = 0, r = 0;
    int sum = 0, d, c = 0;

    while((l + 1)%n != r && c < 2){
        d = a[l] - b[l];
        if(sum + d >=0)
           l++, sum += d;
        else
            sum = 0, l++, r = l;
        if(l == n) c++;
        l %= n;       
    }

    if(c == 2) cout << -1 << endl;
    else cout << r+1 << endl;
    }
int main() {

	// Your code here
    solve();
    return 0;
}
