#include <iostream>
#include <iomanip>
 
using namespace std;
 
int main() {
 
    float mat[12][12], som = 0.0, med = 0.0; 
    int l; 
    char t;

    cin >> l;
    cin >> t;
    for(int i = 0; i < 12; i++){
        for(int j = 0; j < 12; j++){
            cin >> mat[i][j];
            if(l == i){
                som += mat[i][j];
            }            
        }
    }
    if(t == 'S'){
        cout << fixed << setprecision(1) << som << endl;
    } else {
        med = som / 12;
        cout << fixed << setprecision(1) << med << endl;
    }
    return 0;
}