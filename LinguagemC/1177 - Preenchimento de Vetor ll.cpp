#include <iostream>
 
using namespace std;
 
int main() {
 
    int t, n[1000], c=0;
    cin >> t;
    for(int i = 0; i < 1000; i++){
        if(c<t){
            cout << "N[" << i << "] = " << c << endl;
            c++; 
        } else {
            c = 0;
            cout << "N[" << i << "] = " << c << endl;
            c++;
        }                             
    }
 
    return 0;
}