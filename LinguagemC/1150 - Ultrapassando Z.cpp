#include <iostream>
using namespace std;

int main(){
    int x, z, c=0;
    cin>>x;
    cin>>z;
    while(z<=x){
        cin>>z;
    }

    for(int a = x, b=0; b < z; a++){
        b += a;
        c++;   
    }
    cout<<c<<"\n";
    return 0;
}