n=float(input())
if n >= 0.00 and n <= 25.00:
    print('Intervalo [0,25]')
elif n >= 25.01 and n <= 50.00:
    print('Intervalo (25,50]')
elif n >= 50.01 and n <= 75.00:
    print('Intervalo (50,75]')
elif n >= 75.01 and n <= 100.00:
    print('Intervalo (75,100]')
else:
    print('Fora de intervalo')
    