#include <iostream>
using namespace std;

int main (int argc, char** argv) {

    int n;

    cin>> n;

    for (int i = 1; i <= n; i++) {
        cout<<i<<" "<<i*i<<" "<<i*i*i<<endl;
    }
    return 0;
}