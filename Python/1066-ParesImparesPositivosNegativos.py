contpar = contn = contp = contimp = 0
for c in range(0,5):
    n = int(input())
    if n%2==0:
        contpar = contpar + 1
    if n < 0:
        contn = contn + 1
    if n > 0:
        contp = contp + 1
    if n%2!=0:
        contimp = contimp + 1
print(f'{contpar} valor(es) par(es)')
print(f'{contimp} valor(es) impar(es)')
print(f'{contp} valor(es) positivo(s)')
print(f'{contn} valor(es) negativo(s)')
