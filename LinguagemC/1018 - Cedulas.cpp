#include <stdio.h>
#include <math.h>
 
int main() {
    int n, c100, c50, c20, c10, c5, c2, c1;

    scanf("%d",&n);
    printf("%d\n",n);

    c100=n/100;
    c50=(n%100)/50;
    c20=((n%100)%50)/20;
    c10=(((n%100)%50)%20)/10;
    c5=((((n%100)%50)%20)%10)/5;
    c2=(((((n%100)%50)%20)%10)%5)/2;
    c1=((((((n%100)%50)%20)%10)%5)%2)/1;
    
    printf("%d nota(s) de R$ 100,00\n",c100);
    printf("%d nota(s) de R$ 50,00\n",c50);
    printf("%d nota(s) de R$ 20,00\n",c20);
    printf("%d nota(s) de R$ 10,00\n",c10);
    printf("%d nota(s) de R$ 5,00\n",c5);
    printf("%d nota(s) de R$ 2,00\n",c2);
    printf("%d nota(s) de R$ 1,00\n",c1);
    return 0;
}