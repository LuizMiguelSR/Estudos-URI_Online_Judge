n = int(input())
c = 0
for i in range(1,n+1):
    x,y=map(int, input().split(" "))
    s =0
    if x < y:
        for c in range(x+1,y):
            if c%2!=0:
                s=s+c    
    if x > y:
        for c in range(y+1,x):
            if c%2!=0:
                s=s+c
    if (x == y):
        s=0
    print(f'{s}')
