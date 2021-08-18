renda=float(input())
if renda <= 2000.00:
    print('Isento')
elif renda >= 2000.01 and renda <= 3000.00:
    imp=(renda-2000)*0.08
    print(f'R$ {imp:.2f}')
elif renda >= 3000.01 and renda <= 4500.00:
    imp=(1000*0.08)+((renda-3000)*0.18)
    print(f'R$ {imp:.2f}')
else:
    imp=(1000*0.08)+(1500*0.18)+((renda-4500)*0.28)
    print(f'R$ {imp:.2f}')
