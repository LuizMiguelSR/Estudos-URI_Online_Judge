n=int(input())
q=0
for i in range(1,n+1):
    if i%2==0:
        q=i**2
        print(f'{i}^2 = {q}')
