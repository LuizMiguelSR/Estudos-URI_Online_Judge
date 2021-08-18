#include <iostream>
#include <iomanip>
#include <locale.h>
using namespace std;

int main(int argc, char** argv){
    setlocale(LC_ALL,"");
    system("cls");

    int op=0, ca=0, cg=0, cd=0;

    while(op!=4){
        cin>>op;
        if(op == 1){
            ca++;
        } else if(op == 2) {
            cg++;
        } else if(op == 3) {
            cd++;
        }
    }
    cout<<"MUITO OBRIGADO\n";
    cout<<"Alcool: "<<ca<<"\n";
    cout<<"Gasolina: "<<cg<<"\n";
    cout<<"Diesel: "<<cd<<"\n";
    
    return 0;
}