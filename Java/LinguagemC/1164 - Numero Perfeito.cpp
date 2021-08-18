#include <iostream>
 
using namespace std;
 
int main() {
 
    int n, x;

    cin >> n;

    for(int i = 0; i < n; i++){
        cin >> x;
        int som=0;
        for(int j = 1; j <= x; j++){
            if(j!=x){
                if(x%j==0){
                    som+=j;
                }
            }           
        }
        if(som==x){
            cout << x << " eh perfeito" << endl;
        } else {
            cout << x << " nao eh perfeito" << endl;
        }
    }
 
    return 0;
}