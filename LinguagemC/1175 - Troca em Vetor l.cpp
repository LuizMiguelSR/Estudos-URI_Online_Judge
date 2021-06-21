#include <iostream>
 
using namespace std;
 
int main() {
 
    int n[20];
    for(int i = 0; i < 20; i++){
        cin >> n[i];
    }
    int x = 0, z = 19;

    for(int i = 0; i < 10; i++){
        int temp1 = 0, temp2 = 0;
        temp1 = n[x];
        temp2 = n[z];
        n[x] = temp2;
        n[z] = temp1;
        x++;
        z--;
    }
    for(int i = 0; i < 20; i++){
        cout << "N[" << i << "] = " << n[i] << endl;
    }
    return 0;
}