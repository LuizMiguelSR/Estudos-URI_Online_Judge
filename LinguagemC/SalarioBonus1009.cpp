#include <stdio.h>
 
int main() 
{
 
    char name[21];
    double salary, sales, total;
    
    scanf("%s",&name);
    scanf("%lf %lf", &salary, &sales);
    
    total = (sales*0.15)+salary;
    
    printf("TOTAL = R$ %.2lf\n", total);
 
    return 0;
}
