#include <iostream>
using namespace std;
int main(){
    
    int x, n, a,b=0;

    cin>>x>>n;

    while(n<=0)
        cin>>n;
    for(a=1; a<=n; a++){
        b+=x;
        x++;
    }

    cout<<b<<"\n";

    return 0;
}