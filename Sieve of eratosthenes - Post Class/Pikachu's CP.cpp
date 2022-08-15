#define mx 1000005
#include <bits/stdc++.h>

using namespace std;


typedef long long int ll;
int n,a,b,e;
vector<int>V[20];

void PrimeFactor()
{
    V[0].push_back(1);
    for (int i=2;i<=mx;i++)
    {
        int c=0;
        int n=i;
        if (n%2==0)
        {
            c++;
            while (n%2==0)
                n/=2;
        }
        for (int j=3;j<=sqrt(n);j+=2)
        {
            if (n%j==0)
            {
                c++;
                while (n%j==0)
                    n/=j;
            }
        }
        if (n>1)
            c++;
       V[c].push_back(i);
    }
}
int main() {

	// Your code here
     PrimeFactor();
	int T;
    cin >> T;
    while (T--)
    {
        cin >> a >> b >> n;
        int L=upper_bound(V[n].begin(),V[n].end(),a)-V[n].begin();
        int U=upper_bound(V[n].begin(),V[n].end(),b)-V[n].begin();
        if (U-L==0)
            cout << -1 << endl;
        else
            cout << U-L << endl;
		}
    return 0;
}
