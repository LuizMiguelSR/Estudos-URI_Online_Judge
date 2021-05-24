#include <iostream>
#include <iomanip>
#include <locale.h>
using namespace std;
int main(int argc, char** argv) {
    setlocale(LC_ALL,"");
    system("cls");

    int n;

    cin>>n;

    for (int i = 1; i <= n*4; i+=4) {
        cout<<i<<" ";
        cout<<i+1<<" ";
        cout<<i+2<<" ";
        cout<<"PUM\n";
    }
    return 0;
}