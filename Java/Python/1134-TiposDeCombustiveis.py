op = 0
ca = 0
cg = 0
cd = 0
while op != 4:
    op = int(input())
    if op == 1:
        ca += 1
    if op == 2:
        cg += 1
    if op == 3:
        cd += 1
print("MUITO OBRIGADO")
print(f'Alcool: {ca}')
print(f'Gasolina: {cg}')
print(f'Diesel: {cd}')