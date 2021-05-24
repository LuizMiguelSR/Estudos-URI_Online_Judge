#include <iostream>
using namespace std;

int main(int argc, char** argv) {
    int x1, x2, y1, y2;
    x1 = 0;
    y1 = 0;
    x2 = 1;
    y2 = 0;

    cin>>x1>>y1;
    if ((1<x1<20)&&(y1<100000)){
        for(x2=1; x2<=y1; x2++){
            y2++;
            if(y2==x1){
                cout<<x2<<"\n";
                y2 = 0;
            } else {
                cout<<x2<<" ";
            }
        }
    }
    return 0;
}