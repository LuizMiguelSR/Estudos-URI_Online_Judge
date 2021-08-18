#include <iostream>
#include <iomanip>
using namespace std;
int main(){
    int c=0, i=0;
    float med, ni=0;
    while(i>=0){
        cin>>i;
        if(i>=0){
            ni+=i;
            c++;
        }
    }
    med = ni/(float)c;
    cout<<fixed<<setprecision(2)<<med<<endl;
    return 0;
}