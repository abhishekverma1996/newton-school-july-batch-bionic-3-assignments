#include<bits/stdc++.h>
using namespace std;

int main() {

int n;
cin>>n;
int a[n],b[n];
int max=INT_MIN;

for(int i=0;i<n;i++) {
cin>>a[i];
if(a[i]>max) max=a[i];
}
int c[max+1]={0};
for(int i=0;i<n;i++) {cin>>b[i];
c[b[i]]++;
}

for(int i=1;i<=max;i++){
c[i]=c[i-1]+c[i];
}

int q;
cin>>q;
int x;
while(q--){
cin>>x;
cout<<c[a[x]]<<endl; 
}
 return 0;
}
