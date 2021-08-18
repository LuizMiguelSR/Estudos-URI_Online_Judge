#include <iostream>
 
using namespace std;
 
int main() {
 
    int n[10], v;
    cin >> v;    
    for(int i = 0; i <= 9; i++){
        if(i==0){
           n[i] = v; 
           cout << "N[" << i << "] = " << n[i] << endl;
        } else {
            n[i] = n[i-1] * 2;
            cout << "N[" << i << "] = " << n[i] << endl;
        }        
    }

    return 0;
}