conti = conto = 0
ent = int(input())
for c in range(0,ent):
    n = int(input())
    if n >= 10 and n <= 20:
        conti = conti + 1
    else:
        conto = conto + 1
print(f'{conti} in')
print(f'{conto} out')
