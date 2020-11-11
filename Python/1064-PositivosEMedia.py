cont = som =0
for c in range(1,7):
    n=float(input())
    if n > 0.00:
        som = som + n
        cont += 1
med = som / cont
print(f'{cont} valores positivos')
print(f'{med:.1f}')
