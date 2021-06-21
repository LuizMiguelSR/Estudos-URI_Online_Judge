x=int(input())
while (x!=0):
    if (x%2==0):
        c=0
        for i in range(0,5):
            c+=x
            x+=2
        print(f'{c}')
        x=int(input())
    else:
        c=0
        x=x+1
        for i in range(0,5):
            c+=x
            x+=2
        print(f'{c}')
        x=int(input())
