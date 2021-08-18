#include <iostream>
 
using namespace std;
 
int main() {
 
    int t, pa, pb, tempo; 
    double ga, gb, pat, pbt;
    cin >> t;
    for(int i = 1; i <= t; i++){
        tempo = 0;
        cin >> pa >> pb >> ga >> gb;
        while (pa <= pb) {
            pa *= (ga/100.0)+1.0;
            pb *= (gb/100.0)+1.0;
            tempo++;
            if(tempo > 100){
                cout << "Mais de 1 seculo." << endl;
                break;
            }
        }
        if(tempo<=100){
            cout << tempo << " anos." << endl;
        }
    }
    return 0;
}