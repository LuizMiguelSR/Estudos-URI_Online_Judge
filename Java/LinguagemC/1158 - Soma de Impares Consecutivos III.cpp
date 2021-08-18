#include <iostream>
#include <cstdlib>
using namespace std;
int main(){
    int n, x, y, a, b, c, d, e; 
    cin >> n;
    for(a = 1; a <= n; a++){
        cin >> x >> y;
        if(x%2==1){
            c=0;
            for(b=1; b<=y; b++){
                c+=x;
                x+=2;
            }
            cout << c << endl;
        } else {
            x++;
            c=0;
            for(b=1; b <= y; b++){
                c+=x;
                x+=2;
            }
            cout << c << endl;
        }
    }
    return 0;
}