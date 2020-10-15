#include <stdio.h>
 
int main() 
{
 
    int NUMBER, HOURS; 
	float SALARY, VALUE; 
    scanf("%d %d %f", &NUMBER, &HOURS, &VALUE);
    SALARY = (float)HOURS * VALUE;
    printf("NUMBER = %d\n", NUMBER);
    printf("SALARY = U$ %.2f\n", SALARY);
 
    return 0;
}
