#include <iostream>
#include <iomanip>
 
using namespace std;
 
int main() {
 
    float mat[12][12], som = 0.0, med = 0.0, c = 0; 
    char o;

    cin >> o;
    for(int i = 0; i < 12; i++){
        for(int j = 0; j < 12; j++){
            cin >> mat[i][j];        
        }
    }
    for(int i = 0; i <= 10; i++){
        for(int j = 0; j <= 10-i; j++){
            som += mat[i][j];
            c++;
                   
        }
    }
    if(o == 'S'){
        cout << fixed << setprecision(1) << som << endl;
    } else {
        med = som / c;
        cout << fixed << setprecision(1) << med << endl;
    }
 
    return 0;
}