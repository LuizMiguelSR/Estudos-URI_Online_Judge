#include <stdio.h>
 
int main() {
 
    int x, y, xx, yy, i;
    scanf("%d %d", &x, &y);

    if (x>y) {
        xx = x;
        yy = y;
    } else {
        xx = y;
        yy = x;
    }
    for (i=yy+1; i<xx; i++) {
        if (i%5==2 || i%5==3) {
            printf("%i\n", i);
        }
    } 
    return 0;
}