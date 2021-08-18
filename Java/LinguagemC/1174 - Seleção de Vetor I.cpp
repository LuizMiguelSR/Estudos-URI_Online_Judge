#include <iostream>
#include <iomanip>
 
using namespace std;
 
int main() {
 
    float a[100], x;
    for(int i = 0; i < 100; i++){
        cin >> a[i];
        if(a[i]<=10.0){
            cout << "A[" << i << "] = " << fixed << setprecision(1) << a[i] << endl;
        }
    }
 
    return 0;
}