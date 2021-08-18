n1=0
n2=1
c=0
a = int(input())
for b in range(1, a):
    if b%2==1:
        print(f'{c}', end=' ')
        c = n1 + n2
        n1 = c
    elif b == 2:
        print(f'{c}', end=' ')
    elif b%2==0:
        print(f'{c}', end=' ')
        c = n1 + n2
        n2 = c
print(f'{c}\n')