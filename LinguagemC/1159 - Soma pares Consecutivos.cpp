#include <iostream>
#include <cstdlib>
using namespace std;
int main(){
    int x, c;
    cin >> x;
    while(x!=0){
        if (x%2==0){
            c=0;
            for(int i = 0; i < 5; i++){                
                c+=x;
                x+=2;
            }
            cout << c << endl;
            cin >> x;
        } else {
            x++;
            c=0;
            for(int i = 0; i < 5; i++){
                c+=x;
                x+=2;                  
            }
            cout << c << endl;
            cin >> x;
        }         
    }
    return 0;
}