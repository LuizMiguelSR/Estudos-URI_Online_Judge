n=int(input())
for i in range(1,n+1):
    x,y=map(int, input().split(" "))
    if y == 0:
        print('divisao impossivel')
    if y != 0:
        z = x/y
        print(f'{z:.1f}')
