#include <iostream>
 
using namespace std;
 
int main() {
 
    int n, x;
    cin >> n;
    for(int i = 0; i < n; i++){
        cin >> x;
        int c = 0;
        for(int j = 1; j <= x; j++){
            if(x%j==0){
                c++;
            }
        }
        if(c>2){
            cout << x <<" nao eh primo" << endl;
        } else {
            cout << x <<" eh primo" << endl;
        }
    }
 
    return 0;
}