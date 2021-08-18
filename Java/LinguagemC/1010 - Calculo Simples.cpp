#include <stdio.h>
 
int main() 
{
 
    int cod1, cod2, qtde1, qtde2;
    float value1, value2, total;
    
    scanf("%i %i %f", &cod1, &qtde1, &value1);
    scanf("%i %i %f", &cod2, &qtde2, &value2);
    
    total = ((float)qtde1 * value1) + ((float)qtde2 * value2);
    
    printf("VALOR A PAGAR: R$ %.2f\n", total);
 
    return 0;
}
