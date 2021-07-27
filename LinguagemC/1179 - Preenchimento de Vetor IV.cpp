#include <iostream>
 
using namespace std;
 
int main() {
 
    int x, p = 0, im = 0, par[5], impar[5];

    for(int i = 0; i < 15; i++){
        cin >> x;
        if(x%2==0){
            par[p] = x;
            p++;
            if(p==5){
                for(int j = 0; j <= 4; j++){
                    cout << "par[" << j << "] = " << par[j] << endl;
                }
                p = 0;
            }
        } else {
            impar[im] = x;
            im++;
            if(im==5){
                for(int k = 0; k <= 4; k++){
                    cout << "impar[" << k << "] = " << impar[k] << endl;
                }
                im = 0;
            }
        }
        if(i==14){
            for(int k = 0; k < im; k++){
                cout << "impar[" << k << "] = " << impar[k] << endl;
            }
            for(int j = 0; j < p; j++){
                cout << "par[" << j << "] = " << par[j] << endl;
            }
        }
    }
 
    return 0;
}