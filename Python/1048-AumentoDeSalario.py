sal = float(input())
if sal <= 400.00:
    rea = sal * 0.15
    nsal = sal + rea
    print(f'Novo salario: {nsal:.2f}')
    print(f'Reajuste ganho: {rea:.2f}')
    print('Em percentual: 15 %')
elif sal >= 400.01 and sal <= 800.00:
    rea = sal * 0.12
    nsal = sal + rea
    print(f'Novo salario: {nsal:.2f}')
    print(f'Reajuste ganho: {rea:.2f}')
    print('Em percentual: 12 %')
elif sal >= 800.01 and sal <= 1200.00:
    rea = sal * 0.10
    nsal = sal + rea
    print(f'Novo salario: {nsal:.2f}')
    print(f'Reajuste ganho: {rea:.2f}')
    print('Em percentual: 10 %')
elif sal >= 1200.01 and sal <= 2000.00:
    rea = sal * 0.07
    nsal = sal + rea
    print(f'Novo salario: {nsal:.2f}')
    print(f'Reajuste ganho: {rea:.2f}')
    print('Em percentual: 7 %')
else:
    rea = sal * 0.04
    nsal = sal + rea
    print(f'Novo salario: {nsal:.2f}')
    print(f'Reajuste ganho: {rea:.2f}')
    print('Em percentual: 4 %')
