/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Entrada
A entrada contém um valor inteiro N (0 < N < 13).
Saída
A saída contém um valor inteiro, correspondente ao fatorial de N.*/
#include <iostream>
using namespace std;
int main(){
    int n, fat=1;
    cin>>n;
    for(int i = n; i>=1; i--){
        fat*=i;
    }
    cout<<fat<<"\n";
    return 0;
}