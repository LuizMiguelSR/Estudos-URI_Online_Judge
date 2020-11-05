val1, val2, val3=map(int, input().split(" "))
maior = menor = meio = 0
if val1 >= val2 and val2 > val3:
    maior = val1
    meio = val2
    menor = val3
elif val1 >= val3 and val3 > val2:
    maior = val1
    meio = val3
    menor = val2
elif val2 >= val3  and val3 > val1:
    maior = val2
    meio = val3
    menor = val1
elif val2 >= val1  and val1 > val3:
    maior = val2
    meio = val1
    menor = val3
elif val3 >= val2  and val2 > val1:
    maior = val3
    meio = val2
    menor = val1
elif val3 >= val1  and val1 > val2:
    maior = val3
    meio = val1
    menor = val2
print(f'{menor}\n{meio}\n{maior}\n\n{val1}\n{val2}\n{val3}')
