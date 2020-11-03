#include <stdio.h>
 
int main() {
 
    int x;
	float y, res;
    scanf("%d", &x);
    scanf("%f", &y);
    res = (float)x / y;
    printf("%.3f km/l\n", res);
 
    return 0;
}
