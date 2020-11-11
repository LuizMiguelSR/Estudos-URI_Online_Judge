#include <stdio.h>
#include <math.h>
 
int main() {
    int a, b, c, d, somcd, somab;

    scanf("%d %d %d %d",&a,&b,&c,&d);

    somcd = c + d;
    somab = a + b;

    if ((b > c) && (d > a) && (somcd > somab) && (c > 0) && (d > 0) && (a%2==0)) {
        printf("Valores aceitos\n");
    } else {
        printf("Valores nao aceitos\n");
    }
    return 0;
}