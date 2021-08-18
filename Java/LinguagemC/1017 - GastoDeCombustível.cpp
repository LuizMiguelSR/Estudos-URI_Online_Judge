#include <stdio.h>
#include <math.h>
 
int main() {
    int temp;
    float dis, km, x;
    scanf("%d",&temp);
    scanf("%f",&km);
    dis=km*(float)temp;
    x=dis/12;
    printf("%.3f\n",x);
    return 0;
}