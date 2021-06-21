#include <cstdlib>
#include <iostream>
#include <iomanip>
using namespace std;
int main(){
    double i, s=0, c;
    for(i = 1; i <= 100; i++){
        c=1/i;
        s += c;
    }
    cout << fixed << setprecision(2) << s << endl;
    return 0;
}