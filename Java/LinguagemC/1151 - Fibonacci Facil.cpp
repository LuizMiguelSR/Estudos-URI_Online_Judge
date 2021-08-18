#include <iostream> 
using namespace std; 
int main() { 
    int a, b, n1=0, n2=1, c=0; 
    cin>>a;
    for(b = 1; b < a; b++){
        if(b%2==1){
            cout<<c<<" ";
            c = n1 + n2;
            n1 = c;
        } else if (b == 2) {
            cout<<c<<" ";
        } else if (b % 2 == 0){
            cout<<c<<" ";
            c = n1 + n2;
            n2 = c;
        }
    }
    cout<<c<<"\n";
    return 0; 
}