#include <iostream>
using namespace std;

int main(int argc, char** argv){
    int a, b, c, d, e, f;
    cin>>a;
    for(b=1; b<=a; b++){
        c=b*b;
        d=b*b*b;
        cout<<b<<" "<<c<<" "<<d<<endl;
        e=c+1;
        f=d+1;
        cout<<b<<" "<<e<<" "<<f<<endl;
    }
}