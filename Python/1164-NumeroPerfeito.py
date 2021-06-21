n = int(input())
for i in range(0,n):
    x = int(input())
    som = 0
    for j in range(1,x):
        if(j!=x):
            if(x%j==0):
                som+=j
    if(som==x):
        print(f'{x} eh perfeito')
    else:
        print(f'{x} nao eh perfeito')
    