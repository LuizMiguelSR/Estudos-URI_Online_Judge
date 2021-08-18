#include <stdio.h>
#include <math.h>
 
int main() {
    int vl, hor, min, seg;

    scanf("%d",&vl);

    hor=vl/3600;
    min=(vl%3600)/60;
    seg=(vl%3600)%60;

    printf("%d:%d:%d\n",hor,min,seg);
    return 0;
}