maior = pos = 0
for i in range(1,100+1):
    n=int(input())
    if i == 0:
        maior = n
        pos = i
    else:
        if n > maior:
            maior = n
            pos = i
print(f'{maior}')
print(f'{pos}')
