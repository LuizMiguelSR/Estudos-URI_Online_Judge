#include <iostream>
#include <iomanip>
 
using namespace std;
 
int main() {
 
    double n[100], x;
    cin >> x;
    n[0]  = x;
    for(int i = 1; i <= 99; i++){
        n[i] = n[i-1] / 2.0;
    }
    for(int i = 0; i <= 99; i++) {                     
        cout << "N[" << i << "] = " << fixed << setprecision(4) << n[i] << endl;                            
    }
 
    return 0;
}