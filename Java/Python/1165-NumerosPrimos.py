n = int(input())
for i in range(0,n):
    x = int(input())
    c = 0
    for j in range(1,x):
        if(x%j==0):
            c+=1
    if(c > 2):
        print(f'{x} nao eh primo')
    else:
        print(f'{x} eh primo')