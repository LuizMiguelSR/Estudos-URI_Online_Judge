n=int(input())
for i in range(1,n+1):
    n1, n2, n3=map(float, input().split(" "))
    med = ((n1*2)+(n2*3)+(n3*5))/10
    print(f'{med:.1f}')
    