#include <stdio.h>
int main() {
    int dias, ano, mes, dia;

    scanf("%i",&dias);

    ano=dias/365;
    mes=(dias/365)/30;
    dia=(dias%365)%30;

    printf("%d ano(s)\n",ano);
    printf("%d mes(es)\n",mes);
    printf("%d dia(s)\n",dia);
    return 0;
}