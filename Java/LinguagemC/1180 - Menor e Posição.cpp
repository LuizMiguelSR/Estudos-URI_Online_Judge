#include <iostream>
 
using namespace std;
 
int main() {
 
    int n, men, p;
    cin >> n;
    int x[n];
    for(int i = 0; i < n; i++){
        cin >> x[i];
    }
    men = x[0];
    for(int i = 0; i < n; i++){
        if(men>x[i]){
            men = x[i];
            p = i;
        }
    }
    cout << "Menor valor: " << men << endl;
    cout << "Posicao: " << p << endl;
    return 0;
}