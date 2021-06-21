#include <cstdlib>
#include <iostream>
#include <iomanip>
using namespace std;
int main(){
    double i, b = 1, s = 0, c;
    for(i = 1; i <= 39; i += 2){
        c = i / b;
        s += c;
        b *= 2;
    }
    cout << fixed << setprecision(2) << s << endl;
    return 0;
}